import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReturnOfOperationTest {

    @Test
    public void intPlusLong() throws Exception {
        int i = 5;
        long j = 5L;

        assertTrue(Long.class.isInstance(i + j));
    }

    @Test
    public void doublePlusFloat() throws Exception {
        double d = 5.25;
        float f = 5.7f;

        assertTrue(Double.class.isInstance(d+f));
    }

    @Test
    public void shortDivideShort() throws Exception {
        short sh1 = 6;
        short sh2 = 36;


        Integer.class.isInstance(sh1 + sh2);
    }


}
