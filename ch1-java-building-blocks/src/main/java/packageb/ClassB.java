package packageb;

import packagea.ClassA;

public class ClassB {

	private ClassA classA;

	public String getAName(){

		classA = new ClassA();

		return classA.getName();
	}
}
