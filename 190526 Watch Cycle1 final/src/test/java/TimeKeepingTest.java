import org.junit.Test;

import static org.junit.Assert.*;

public class TimeKeepingTest {

    @Test
    public void setTimePart() {
        View v = new View();
        TimeKeeping tk = new TimeKeeping(v);
        tk.part = 6; // hour10
        tk.time.format= 2; // time format 24h
        tk.time.hour = 5;
        tk.saveValue = 2;
        tk.setTimePart(0);

        assertEquals(0, tk.saveValue);
    }

    @Test
    public void southFinder() {
        View v = new View();
        TimeKeeping tk = new TimeKeeping(v);
        tk.time.format =0;
        tk.southFinder("0","3","2","1");

        assertEquals(1,tk.eLCD[1]);
        assertEquals(1,tk.eLCD[2]);
    }
}


