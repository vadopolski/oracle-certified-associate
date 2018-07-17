import org.hamcrest.core.Is;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ForExampleTest {
    ForExample forExample = new ForExample();
    
    @Ignore
    @Test
    public void infiniteLoop() {
        forExample.infiniteLoop();
    }
    
    @Test
    public void multipleTerms() {
        String expectedString = "0123";
        
        String actualString = forExample.multipleTerms();
        
        assertThat(actualString, Is.is(expectedString));
    }
    
    @Test
    public void redeclaringTheVariable() {
        String expectedResult = "81012141618";
        
        String actualString = forExample.redeclaringTheVariable();
        
        assertThat(actualString, Is.is(expectedResult));
    }
    
    @Test
    public void uncompatibleTypes() {
        String expectedResult = "";
        
        String actualResult = forExample.uncompatibleTypes();
        
        assertThat(actualResult, Is.is(expectedResult));
    }
    
    @Test
    public void loopVariablesOutside() {
        String expectedResult = "0123456789";
        
        String actualResult = forExample.loopVariablesOutside();
        
        assertThat(actualResult, Is.is(expectedResult));
    }
}