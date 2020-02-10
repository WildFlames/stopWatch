package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class stopWatchController {

	int count = 0;
	boolean isStarted = false;

	@FXML
	Button btnStart = new Button();

	@FXML
	Button btnStop = new Button();

	@FXML
	Button btnReset = new Button();

	@FXML
	Text txt = new Text();

	public void start() {
		isStarted = true;
		Thread thread = new Thread(runnable);
		thread.start();
	}

	public void stop() {
		isStarted = false;
	}

	public void reset() {
		isStarted = false;
		count = 0;
		txt.setText("00:00:00");

	}

	Runnable runnable = new Runnable() {

		@Override
		public synchronized void run() {

			while (isStarted) {

				int hours = count / 3600;
				int minutes = (count % 3600) / 60;
				int seconds = count % 60;
				String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
				try {
					txt.setText(time);
					Thread.sleep(1000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count++;
			}
		}
	};

}
