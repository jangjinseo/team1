import java.util.*;

public class Buzzer {

    public Buzzer(View view) {
    	this.view = view;
    }
    
    private View view;
    public boolean on;
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
        		while(true) {
        			if(dur == 5000)
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
        		reqStop(func);
        	}
        });
        funcType = func;
        buzduration.start();
    }

}