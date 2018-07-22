import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreakLoopStatementTest {
    @Test
    public void getMessage() throws Exception {
        int searchingValue = 2;
        int[][] matrix = {{1, 3, 5},
                        {2, 6, 7},
                        {3, 4, 2}};

        String expectedResult = "There is no searched value in matrix";
        BreakLoopStatement breakLoopStatement = new BreakLoopStatement();
        String actualResult = breakLoopStatement.getCoordinatesOfSearchedValue(matrix, searchingValue);

        assertThat(actualResult, Is.is(expectedResult));
    }
}