import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class WhileExampleTest {
    private final WhileExample whileExample = new WhileExample();
    
    @Test
    public void eatCheeseMethodWithWhileTest_aLittleOfCheese_nothingRoomInBells() {
        int expectedLeftRoomInBells = 2;
    
        int actualLeftRoomInBells = whileExample.eatCheeseMethodWithWhile(3);
        
        assertThat(actualLeftRoomInBells, Is.is(expectedLeftRoomInBells));
    }

    @Test
    public void eatCheeseMethodWithDoWhileTest_aLittleOfCheese_nothingRoomInBells() {
        int expectedLeftRoomInBells = 2;
    
        int actualLeftRoomInBells = whileExample.eatCheeseMethodWithDoWhile(3);
        
        assertThat(actualLeftRoomInBells, Is.is(expectedLeftRoomInBells));
    }
}