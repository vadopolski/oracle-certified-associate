import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class CastingPrimitiveValues {

    @Test
    public void testPrimitiveCast(){
        short expectedCastingShort = Short.MIN_VALUE;


        short actualCastingShort = (short) 32768;

        assertThat(actualCastingShort, Is.is(expectedCastingShort));
    }

}
