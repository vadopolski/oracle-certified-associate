import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ChainingTest {
    
    @Test
    public void chainingTest(){
        String expectedResult = "A23";
        String startString = "abc";
        String nextString = startString.toUpperCase();
        
        String actualResult = nextString.replace("B", "2").replace("C", "3");
        
        assertThat(expectedResult, Is.is(actualResult));
    }
}