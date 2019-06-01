import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RandomDirectionGeneratorTest {

    @Test
    public void reqRandomDirection() {
        View v = new View();
        RandomDirectionGenerator rdg = new RandomDirectionGenerator(v);
        rdg.reqRandomDirection();

        int flag =0;
        if(rdg.result >= 0 && rdg.result <=60)
            flag =1;

        assertEquals(1, flag);


    }
}

