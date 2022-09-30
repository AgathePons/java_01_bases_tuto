package tuto.variables;

public class conditions {

	public static void main(String[] args) {
		if (args.length == 1) {
			sayHelloTo(args[0]);
		} else {
			sayHelloTo("world");
		}
	}

	private static void sayHelloTo(String recipient) {
		System.out.println("Hello " + recipient);
	}

}
