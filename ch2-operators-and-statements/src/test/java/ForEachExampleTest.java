import java.util.Arrays;
import java.util.List;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ForEachExampleTest {
    
    String[] expectedArray;
    ForEachExample forEachExample;
    String expectedString;
    String expectedStringWithComma;
    
    @Before
    public void setUp() throws Exception {
        expectedString = "ha ha ha";
        expectedArray = expectedString.split(" ");
        forEachExample = new ForEachExample();
        expectedStringWithComma = "ha, ha, ha";
        
    }
    
    @Test
    public void arrayToStringTest() {
        String actualString = forEachExample.arrayToString(expectedArray);
    
        assertThat(actualString, Is.is(expectedString));
    }
    
    @Test
    public void listToStringTest() {
        String actualString = forEachExample.listToString(Arrays.asList(expectedArray));
        
        assertThat(actualString, Is.is(expectedString));
    }

    @Test
    public void listToStringWithCommaWithoutSpaceTest() {
        String actualString = forEachExample.listToStringWithCommaWithoutSpace(Arrays.asList(expectedArray));
        
        assertThat(actualString, Is.is(expectedStringWithComma));
    }
    
    
}