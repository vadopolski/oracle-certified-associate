package constructor;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChikenTest {

	@Test
	public void getName_actualName_ExpectedName() {
		Chiken chiken = new Chiken();
		String expectedName = "Duke";

		String actualName = chiken.getName();

		assertThat(actualName, Is.is(expectedName));
	}
}