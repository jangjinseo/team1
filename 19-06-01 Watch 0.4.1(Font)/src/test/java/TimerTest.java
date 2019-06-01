import org.junit.Test;

import static org.junit.Assert.*;

public class TimerTest {

    @Test
    public void setTimerPart() {
        View v = new View();
        Buzzer b = new Buzzer(v);
        Timer tm = new Timer(v,b);

        tm.part = 1; // sec
        tm.saveValue = 5;

        tm.setTimerPart(0);

        assertEquals(tm.timer.sec , tm.saveValue);

    }
}


