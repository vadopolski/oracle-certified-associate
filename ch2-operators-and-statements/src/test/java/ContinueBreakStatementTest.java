import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContinueBreakStatementTest {
    
    @Test
    public void getStringStatementTest_firstRowString() {
        ContinueBreakStatement continueBreakStatement = new ContinueBreakStatement();
        String expectedString = "1a 2a 3a";
        
        String actualString = continueBreakStatement.getStringStatement();
        
        assertThat(actualString, Is.is(expectedString));
    }
}