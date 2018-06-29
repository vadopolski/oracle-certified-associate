package constructor;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

	@Test
	public void testFullName_expectedLastName_actualLastName(){
		Name vadimOpolski = new Name();
		String expectedFullName = "VadimOpolski";

		String actualFullName = vadimOpolski.full;

		assertThat(expectedFullName, Is.is(actualFullName));
	}
}