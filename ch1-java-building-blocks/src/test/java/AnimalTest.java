import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AnimalTest {


	@Test
	public void getNameTest_expectedName_actualName() throws Exception {
		String expectedName = "testName";
		Animal animal = new Animal();
		animal.setName(expectedName);

		String actualName = animal.getName();

		assertThat(actualName, Is.is(expectedName));
	}

}