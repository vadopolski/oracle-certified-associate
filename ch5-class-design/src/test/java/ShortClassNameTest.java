import org.hamcrest.core.Is;
import org.junit.Test;
import short_class_name.ShortClassName;

import static org.junit.Assert.assertThat;

public class ShortClassNameTest {
    
    
    
    
    @Test
    public void shortClassNameGetTest(){
        ShortClassName shortClassName = new ShortClassName();
        String expectedShortClassName = "ShortClassName";
        
        String actualShortClassName = shortClassName.getClass().getSimpleName();
        
        assertThat(actualShortClassName, Is.is(expectedShortClassName));
    }
}
