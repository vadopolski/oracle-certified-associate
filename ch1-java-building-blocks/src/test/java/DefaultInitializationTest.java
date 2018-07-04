import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultInitializationTest {

    @Test
    public void testDefaultVariable() throws Exception {
        DefaultInitialization defaultInitialization = new DefaultInitialization();
        String expectedStringPlusDefaultValue = "null";
        boolean expectedBooleanDefaultClassVariable = false;
        int expectedIntDefaultClassVariable = 0;

        String actualStringPlusDefaultValue = defaultInitialization.getNewString("");
        boolean actualBooleanDefaultClassVariable = defaultInitialization.booleanClassVariable;
        int actualIntDefaultClassVariable = defaultInitialization.intClassVariable;

        assertThat(actualStringPlusDefaultValue, Is.is(expectedStringPlusDefaultValue));
        assertThat(actualBooleanDefaultClassVariable, Is.is(expectedBooleanDefaultClassVariable));
        assertThat(actualIntDefaultClassVariable, Is.is(expectedIntDefaultClassVariable));
    }
}