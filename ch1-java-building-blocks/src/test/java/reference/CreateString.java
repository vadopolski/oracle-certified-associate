package reference;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertTrue;

public class CreateString {


	@Test
	public void testDifferentReferenceTheSameObjectAndValue(){
		String firstStringFromStringPool = "The Same String";
		String secondStringFromStringPool = "The Same String";

		assertTrue(firstStringFromStringPool == secondStringFromStringPool);
		assertEquals(firstStringFromStringPool, secondStringFromStringPool);
		assertTrue(firstStringFromStringPool.equals(secondStringFromStringPool));
	}

	@Test
	public void testDifferentReferenceAndObjectTheSameValue(){
		String firstStringFromStringPool = "The Same String";
		String secondStringFromStringPool = new String("The Same String");

		assertFalse(firstStringFromStringPool == secondStringFromStringPool);
		assertNotSame(firstStringFromStringPool, secondStringFromStringPool);
		assertTrue(firstStringFromStringPool.equals(secondStringFromStringPool));
	}
}