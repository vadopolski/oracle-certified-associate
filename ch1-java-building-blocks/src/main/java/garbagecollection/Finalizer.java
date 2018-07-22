package garbagecollection;

public class Finalizer {

	@Override protected void finalize() throws Throwable {
		System.out.println("Finalize");
	}

	public static void main(String[] args) {
		Finalizer finalizer = new Finalizer();
	}
}
