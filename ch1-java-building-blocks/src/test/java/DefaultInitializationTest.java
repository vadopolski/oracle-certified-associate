import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultInitializationTest {
    @Test
    public void getNewString() throws Exception {
        DefaultInitialization defaultInitialization = new DefaultInitialization();
        String expectedStringPlusDefaultValue = "Testnull";

        String actualStringPlusDefaultValue = defaultInitialization.getNewString("Test");

        boolean booleanClassVariable = defaultInitialization.booleanClassVariable;

        assertThat(expectedStringPlusDefaultValue, Is.is(actualStringPlusDefaultValue));



    }
}