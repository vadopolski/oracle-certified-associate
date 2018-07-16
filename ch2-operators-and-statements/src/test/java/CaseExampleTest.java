import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaseExampleTest {
    
    @Test
    public void getSortOrder() {
        CaseExample caseExample = new CaseExample();
        int expectedOrder1 = 10;
        
        int actualOrder1 = caseExample.getSortOrder("Test", "Ivanov");
        
        assertThat(actualOrder1, Is.is(expectedOrder1));
        
        
        int expectedOrder2 = 3;
        
        int actualOrder2 = caseExample.getSortOrder("T", "Ivanov");
        
        assertThat(actualOrder2, Is.is(expectedOrder2));
    }
}