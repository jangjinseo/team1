import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlarmUI {

	public AlarmUI(Alarm alarm, View view) {
		this.alarm = alarm;
		this.view = view;
		
		view.btnFunct.addActionListener(flistener);
    	view.btnStart.addActionListener(slistener);
    	view.btnMode.addActionListener(mlistener);
    	view.btnReset.addActionListener(rlistener);
		
	}
	
	private Alarm alarm;
	private View view;
	

	ActionListener flistener = new ActionListener() {
	    public void actionPerformed(ActionEvent startlistener) {
			try {
				if(view.checkfunc(4) == 0) {
					return;
				}
				System.out.println("alarm funct");
			} catch (RuntimeException e) {}
		}	
	};
	ActionListener slistener = new ActionListener() {
	    public void actionPerformed(ActionEvent startlistener) {
			try {
				if(view.checkfunc(4) == 0) {
					return;
				}
				System.out.println("alarm start");
			} catch (RuntimeException e) {}
		}	
	};
	ActionListener mlistener = new ActionListener() {
	    public void actionPerformed(ActionEvent startlistener) {
			try {
				if(view.checkfunc(4) == 0) {
					return;
				}
			} catch (RuntimeException e) {}
		}	
	};
	ActionListener rlistener = new ActionListener() {
	    public void actionPerformed(ActionEvent startlistener) {
			try {
				if(view.checkfunc(4) == 0) {
					return;
				}
				System.out.println("alarm reset");
			} catch (RuntimeException e) {}
		}	
	};
	
}
