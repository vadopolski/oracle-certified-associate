import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConvertingTest {

    @Test
    public void getBinary() throws Exception {
        final String expectedValue = "101";
        final BinaryConverting binaryConverting = new BinaryConverting();

        final String actualValue = binaryConverting.getBinary(5);

        assertThat(actualValue, Is.is(expectedValue));
    }

}