package tuto.variables;

public class conditions {

	public static void main(String[] args) {

		// if / else
		if (args.length == 1) {
			sayHelloTo(args[0]);
		} else {
			sayHelloTo("world");
		}

		// if / else if / else
		if (args.length == 1) {
			sayHelloTo(args[0]);
			System.out.println("How are you Bro?");
		} else if (args.length > 1) {
			for (String person : args) {
				sayHelloTo(person);
			}
			System.out.println("How are you Bros?");
		} else {
			sayHelloTo("World");
		}

		// switch
		switch (args.length) {
		case 0:
			sayHelloTo("world");
			break;
		case 1:
			sayHelloTo(args[0]);
			System.out.println("You are alone here...");
			break;
		case 2:
			sayHelloTo(args[0]);
			sayHelloTo(args[1]);
			System.out.println("You are two here");
			break;
		default:
			System.out.println("Hmm you are too many people here.");
		}
	}

	private static void sayHelloTo(String recipient) {
		System.out.println("Hello " + recipient);
	}

}
