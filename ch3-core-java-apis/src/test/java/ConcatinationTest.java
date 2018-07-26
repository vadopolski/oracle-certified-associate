import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ConcatinationTest {
    
    
    
    @Test
    public void concatinationRuleTest(){
        String expectedResult = "64";
        int three = 3;
        String four = "4";
        
        String actualResult = 1 + 2 + three + four;
    
        assertThat(actualResult, Is.is(expectedResult));
    }
    
    @Test
    public void immutableTest(){
        String expectedResult = "12";
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        
        assertThat(s2, Is.is(expectedResult));
    }
}
