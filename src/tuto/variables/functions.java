package tuto.variables;

/**
 * Implementation of the Hello World message in Java
 * 
 * @author Atsohga
 */

public class functions {

	public static void main(String[] args) {
		sayHelloTo("world");
	}

	/**
	 * Displays Hello to the provided recipient
	 * 
	 * @param recipient
	 */
	private static void sayHelloTo(String recipient) {
		System.out.println("Hello " + recipient);
	}

}
