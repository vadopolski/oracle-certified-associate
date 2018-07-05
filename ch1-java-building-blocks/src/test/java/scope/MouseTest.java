package scope;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class MouseTest {

	@Test
	public void growTest() {
		int expectedHeight1 = 3;
		int expectedHeight2 = 3;
		Mouse mouse = new Mouse();

		int actualHeight1 = mouse.grow(3);

		assertThat(actualHeight1, Is.is(expectedHeight1));

		int actualHeight2 = mouse.grow(3);

		assertThat(actualHeight2, Is.is(expectedHeight2));
	}
}