import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueTest {
    @Test
    public void countIntMaxValue() throws Exception {
    int expectedMaxValue = Integer.MAX_VALUE;
    MaxValue maxValue = new MaxValue();

    int actualMaxValue = maxValue.countIntMaxValue();

    assertThat(expectedMaxValue, Is.is(actualMaxValue));


    }

}