import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueTest {

    private byte expectedByteMaxValue;
    private short expectedShortMaxValue;
    private int expectedIntegerMaxValue;
    private long expectedLongMaxValue;
    private float expectedFloatMaxValue;
    private MaxValue maxValue;

    @Before
    public void setUp() throws Exception {
        expectedByteMaxValue = Byte.MAX_VALUE;
        expectedShortMaxValue = Short.MAX_VALUE;
        expectedIntegerMaxValue = Integer.MAX_VALUE;
        expectedLongMaxValue = Long.MAX_VALUE;
        expectedFloatMaxValue = Float.MAX_VALUE;
        maxValue = new MaxValue();
    }

    @Test
    public void countByteMaxValue() throws Exception {
        byte actualByteMaxValue = maxValue.countByteMaxValue();

        assertThat(actualByteMaxValue, Is.is(expectedByteMaxValue));
    }

    @Test
    public void countShortMaxValue() throws Exception {
        short actualShortMaxValue = maxValue.countShortMaxValue();

        assertThat(actualShortMaxValue, Is.is(expectedShortMaxValue));
    }

    @Test
    public void countIntMaxValue() throws Exception {
        int actualIntegerMaxValue = maxValue.countIntMaxValue();

        assertThat(actualIntegerMaxValue, Is.is(expectedIntegerMaxValue));
    }

    @Test
    public void countLongMaxValue() throws Exception {
        long actualLongMaxValue = maxValue.countLongMaxValue();

        assertThat(actualLongMaxValue, Is.is(expectedLongMaxValue));
    }

    @Test
    public void countFloatMaxValue() throws Exception {
        float actualFloatMaxValue = maxValue.countFloatMaxValue();

        assertThat(actualFloatMaxValue, Is.is(expectedFloatMaxValue));
    }
}