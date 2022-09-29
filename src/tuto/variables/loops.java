package tuto.variables;

public class loops {

	public static void main(String[] args) {
		giveHello();
		giveNumbers();
		giveHugs();
		giveHourra();
		ignoreNumber(3);
		findNumber(4);
	}

	private static void giveHello() {
		// as usual
		for (int i = 0; i <= 3; i++) {
			System.out.println("Hello Jean-Michèle dev n°" + Integer.toString(i));
		}
	}

	private static void giveNumbers() {
		// on iterable
		int[] myArray = new int[] { 7, 2, 4 };
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	private static void giveHugs() {
		// while true
		int hugs = 0;
		while (hugs < 50) {
			hugs = (int) (Math.random() * ((100 - 1) + 1) + 1);
			System.out.println("Hugs received: " + hugs);
		}
	}

	private static void giveHourra() {
		// do while (is executed a least once)
		double randomNumber = (double) (Math.random());
		System.out.println(randomNumber);
		do {
			randomNumber = (double) (Math.random());
			System.out.println("Hourra!!");
		} while (randomNumber <= 0.5);
	}

	private static void ignoreNumber(int numberToIgnore) {
		// continue
		for (int i = 0; i < 10; i++) {
			if (i == numberToIgnore) {
				continue;
			}
			System.out.println("I have the number " + i);
		}
	}

	private static void findNumber(int numberToFind) {
		// break
		for (int i = 0; i < 10; i++) {
			if (i == numberToFind) {
				System.out.println("I found a " + i);
				break;
			}
			System.out.println("I search a " + numberToFind + " but I found a " + i);
		}
	}

}
