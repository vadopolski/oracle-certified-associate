import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class UnaryOperatorTest {

    @Test
    public void testPlusPlus(){
        int count = 0;
        final int expectedCountPlusPlus = 0;

        assertThat(count++, Is.is(expectedCountPlusPlus));

        final int expectedPlusPlusCount = 2;

        assertThat(++count, Is.is(expectedPlusPlusCount));
    }
}