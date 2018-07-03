package scope;

public class EatMore {

	public int eatMore(boolean hungry, int amountOfEat) {
		int roomInBells = 5;

		if (hungry) {
			boolean timeToEat = true;

			while (amountOfEat > 0) {
				int amountEaten = 2;
				amountOfEat = amountOfEat - amountEaten;
				roomInBells = roomInBells - amountEaten;
			}
		}

		return amountOfEat;
	}
}