import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFunctionUI {

	public SelectFunctionUI(SelectFunction selectfunction, View view) {
		this.selectfunction = selectfunction;
		this.view = view;
		
		view.btnFunct.addActionListener(flistener);
		view.btnStart.addActionListener(slistener);
		view.btnMode.addActionListener(mlistener);
		view.btnReset.addActionListener(rlistener);
	}
	
	private SelectFunction selectfunction;
	private View view;
	

	ActionListener flistener = new ActionListener() {
	    public void actionPerformed(ActionEvent listener) {
			try {				
			} catch (RuntimeException e) {}
		}	
	};
	ActionListener slistener = new ActionListener() {
	    public void actionPerformed(ActionEvent listener) {
			try {
				if(view.checkfunc(1) == 0) {
					return;
				}
			} catch (RuntimeException e) {}
		}	
	};
	ActionListener mlistener = new ActionListener() {
	    public void actionPerformed(ActionEvent listener) {
			try {
			
				selectfunction.reqNextFunction();
			} catch (RuntimeException e) {}
		}	
	};
	ActionListener rlistener = new ActionListener() {
	    public void actionPerformed(ActionEvent listener) {
			try {
				if(view.checkfunc(1) == 0) {
					return;
				}
			} catch (RuntimeException e) {}
		}	
	};

}
