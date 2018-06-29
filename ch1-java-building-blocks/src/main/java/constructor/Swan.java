package constructor;

public class Swan {

	int numberEggs;

	public static void main(String[] args) {
		Swan mother = new Swan();

		mother.numberEggs = 3;

		System.out.println(mother.numberEggs);
	}
}
