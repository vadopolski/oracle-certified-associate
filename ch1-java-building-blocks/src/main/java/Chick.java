import constructor.Chiken;

public class Chick {

	private String name = "Fluffy";
	{
		System.out.println("Setting fields Fluffy: " + name);
	}

	public Chick() {
		this.name = "Tiny";
		{
			System.out.println("Setting field in constructor: " + name);
		}
	}

	public static void main(String[] args) {
		Chick chick = new Chick();

		System.out.println(chick.name);
	}
}
