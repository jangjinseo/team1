import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SelectFunction{

    public SelectFunction(View view, FunctionList list) {
    	functionlist = list;
    	this.view = view;
    	
	}
	
    	
	public View view;
	public int funcNum = 7;
	public FunctionList functionlist;
	public int currFunct = 1;
	public int selectedFunction;
	public int[] eLCD = null;

    public void reqNextFunction() {
        // TODO implement here;
        currFunct = functionlist.getNextFunction(currFunct);
        view.currfunc = currFunct;
        System.out.println("curr func = "+ view.currfunc);
        switch(currFunct) {
        case 1:
        	functionlist.timekeeping.displayTime();
        	view.funcTest.setText("TimeKeeping");
        	view.initLabel();
        	view.initDot();
        	break;
        case 2:
        	functionlist.timer.reqResetTimer();
        	view.funcTest.setText("Timer");
        	view.monthlb.setText("");
        	view.daylb.setText("");
        	view.datelb.setText("");
        	view.ampm.setText("");
        	view.initLabel();
        	view.initDot();
        	break;
        case 3: 
        	view.funcTest.setText("StopWatch");
        	view.monthlb.setText("");
        	view.daylb.setText("");
        	view.datelb.setText("");
        	view.ampm.setText("");
        	view.initLabel();
        	view.initDot();
        	break;
        case 4:
        	view.funcTest.setText("Alarm");
        	view.monthlb.setText("");
        	view.daylb.setText("");
        	view.datelb.setText("");
        	view.ampm.setText("");
        	view.initLabel();
        	view.initDot();
        	break;
        case 5:
        	functionlist.rng.reqSetScope();
        	view.funcTest.setText("R. N. G");
        	view.monthlb.setText("");
        	view.daylb.setText("");
        	view.datelb.setText("");
        	view.ampm.setText("");
        	view.initLabel();
        	view.initDot();
        	break;
        case 6:
        	view.sec.setText("");
            view.sec10.setText("");
            view.min.setText("");
            view.min10.setText("");
            view.hour.setText("");
            view.hour10.setText("");
            view.monthlb.setText("");
        	view.daylb.setText("");
        	view.datelb.setText("");
        	view.ampm.setText("");
            view.funcTest.setText("R. D. G");
            view.initDot();
            break;
        case 7: 
        	view.funcTest.setText("SelectFunction");
        	view.initLabel();
        	view.initDot();
        	break;
        }
        
    }

    public void reqSelectFunction() {
        // TODO implement here
        
    }

    public void setFunction() {
        // TODO implement here
        
    }

}