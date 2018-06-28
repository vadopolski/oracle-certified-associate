package packageb;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassBTest {

	@Test
	public void getAName_expectedName_actualName() {
		ClassB classB = new ClassB();
		String expectedName = "Name";

		String actualName = classB.getAName();

		assertThat(actualName, Is.is(expectedName));
	}
}