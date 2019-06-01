import java.util.*;

public class Buzzer {

	public Buzzer(View view, AlarmList alist) {
		this.view = view;
		this.alist = alist;
	}

	public AlarmList alist;
	private View view;
	public boolean on = false;
	private int interval;
	private int duration;
	public int funcType = 0;
	public void reqStop(int func) {
		// TODO implement here
		view.buzzerlb.setText("");
		on = false;
		funcType = 0;
	}

	public void beep(int func) {//1 -> timer 2-> alarm
		// TODO implement here

		view.initLabel();
		on = true;
		Thread buzduration = new Thread(new Runnable() {
			public void run() {
				int dur = 0;
				if(func == 1) {
					while(true) {
						if(dur == 5000)
							break;
						if(on == false)
							break;
						view.buzzerlb.setText("TimerBuzzerOn");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {}
						dur = dur + 500;
						view.buzzerlb.setText("");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {}
						view.buzzerlb.setText("TimerBuzzerOn");
					}
				}
				else {
					while(true) {
						if(dur == 60000)
							break;
						if(on == false)
							break;
						view.buzzerlb.setText("AlarmBuzzerOn");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {}
						dur = dur + 500;
						view.buzzerlb.setText("");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {}
						view.buzzerlb.setText("AlarmBuzzerOn");
					}
				}
				reqStop(func);
			}
		});
		funcType = func;
		buzduration.start();
	}

}