package scope;

public class Mouse {
	final static int MAX_LENGTH = 5;
	int length;

	public int grow(int ishes) {
		int newSize = length + ishes;
		if (newSize < MAX_LENGTH) {
			length = newSize;
			return newSize;
		}
		else {
			return length;
		}
	}
}
