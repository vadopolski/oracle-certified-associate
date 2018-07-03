package scope;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class EatMoreTest {

	@Test
	public void eatMore() {
		int expectedAmountOfEat = -1;
		EatMore eatMore = new EatMore();

		int actualAmountOfEat = eatMore.eatMore(true, 5);

		assertThat(actualAmountOfEat, Is.is(expectedAmountOfEat));

	}
}