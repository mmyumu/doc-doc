package net.mmyumu.docdoc.ui.handlers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.inject.Inject;

import net.mmyumu.docdoc.connections.AirMediaConnection;
import net.mmyumu.docdoc.connections.AirMediaConnectionFactory;
import net.mmyumu.docdoc.connections.exceptions.AirMediaConnectionException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CaptureToAirMediaHandler {

	@Inject
	private Logger logger;

	@Inject
	private AirMediaConnectionFactory airMediaConnectionFactory;

	public static void rawToJpeg(byte[] bytes, File outputFile) {
		try {
			BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
			ImageIO.write(img, "jpg", outputFile);
		} catch (IOException e) {
			// Handle exception
		}
	}

	@Execute
	public void execute(Shell shell) {

		final AirMediaConnection airMediaConnection = airMediaConnectionFactory
				.instance();

		Job job = new Job("Sending capture to Air Media Server") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				while (true) {
					System.out.println("job while");
					Display.getDefault().syncExec(new Runnable() {

						@Override
						public void run() {
							System.out.println("display exec");
							/*
							 * Widget capturing logic
							 */
							GC gc = new GC(shell.getDisplay());
							final Image image = new Image(
									shell.getDisplay(), shell.getBounds());
							gc.copyArea(
									image, shell.getBounds().x,
									shell.getBounds().y);
							gc.dispose();

							ImageLoader loader = new ImageLoader();
							loader.data = new ImageData[] { image
									.getImageData() };
							ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
							loader.save(byteArrayOutputStream, SWT.IMAGE_PNG);
							loader.save("E:\\swttest.png", SWT.IMAGE_PNG);

							try {
								airMediaConnection.send(Base64
										.getEncoder().encode(
												byteArrayOutputStream
														.toByteArray()));
							} catch (AirMediaConnectionException e) {
								logger
										.error(
												e,
												"Error while sending screenshot to Air Media server");
							}
						}
					});
				}
			}
		};
		job.setPriority(Job.INTERACTIVE);
		job.schedule();
	}
}
