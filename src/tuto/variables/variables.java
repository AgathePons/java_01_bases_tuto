// Numeric primitive types : int (integer), long (big integer), float (floating
// number), double (floating number with more decimal places)
// Boolean type : boolean
// String type : String
// --------------------------------------------------------------------------
package tuto.variables;

public class variables {

	public static void main(String[] args) {
		int agePerson = 25;
		agePerson = 30;
		agePerson = agePerson + 10;
		System.out.println("Age = " + agePerson + " ans");

		int saving = 1000;
		int income = 500;
		float decimalNumber = 2;

		// saving = saving + income / 5;
		// += // -+ // *= // /*
		saving += income / 5;
		System.out.println("Yo, you have " + saving + " dollars on your bank account !");

		// --------------------------------------------------------------------------
		// Calculate the percent of vowels in a string :
		// String incomeText = new String("Some words, made with some letters");
		String incomeText = "Some words, made with some letters";
		int numberOfVowels = 0;
		double percentageOfVowels = 0;

		System.out.println("number of characters: " + incomeText.length());

		for (int i = 0; i < incomeText.length(); i++) {
			if (incomeText.charAt(i) == 'a' || incomeText.charAt(i) == 'e' || incomeText.charAt(i) == 'i'
					|| incomeText.charAt(i) == 'o' || incomeText.charAt(i) == 'u' || incomeText.charAt(i) == 'y') {
				numberOfVowels += 1;
				System.out.println("numberOfVowels: " + numberOfVowels);
			}
		}

		// percentageOfVowels = Float.valueOf(numberOfVowels) /
		// Float.valueOf(incomeText.length()) * 100;
		// we can cast integer in float to manipulate values with decimal from integers
		// :
		percentageOfVowels = (float) numberOfVowels / (float) incomeText.length() * 100;
		System.out.println("Il y a " + percentageOfVowels + "% de voyelles dans le texte saisi.");
		// --------------------------------------------------------------------------

		// in Java, constant variables are written upper case, with the key word "final"
		final int NUMBEROFWEEKDAYS = 7;
		// Because NUMBEROFWEEKDAYS is a constant variable, it cannot be assigned:
		// NUMBEROFWEEKDAYS += 1 ==> error;
		final String MYNAME = "Agathe";
		System.out.println("There are " + NUMBEROFWEEKDAYS + " days in a week.");
		System.out.println("My name is " + MYNAME);
		// we can declare a new variable without value
		int numberOfSomething;
		numberOfSomething = 3;
		System.out.println("I have " + numberOfSomething + " things :D");

		// Boolean
		boolean isAwesome = true;

		// test concatenate many types
		System.out.println("String: " + MYNAME + ". double: " + percentageOfVowels + ". integer: " + saving
				+ ". float: " + decimalNumber + ". boolean: " + isAwesome);

		String concatenedTypes = "String: " + MYNAME + ". double: " + percentageOfVowels + ". integer: " + saving
				+ ". float: " + decimalNumber + ". boolean: " + isAwesome;
		System.out.println(concatenedTypes);
	}

}
