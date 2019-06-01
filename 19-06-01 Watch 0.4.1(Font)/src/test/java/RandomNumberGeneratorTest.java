import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNumberGeneratorTest {

    @Test
    public void reqRandomNumber() {

        View v = new View();
        RandomNumberGenerator rng = new RandomNumberGenerator(v);
        int result = rng.reqRandomNumber(100);
        int flag;

        if(result>=0 && result<100)
            flag = 1;
        else
            flag =0;

        assertEquals(flag,1);
    }
}

