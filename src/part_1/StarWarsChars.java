/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   StarWarsChars.java                           :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/04 20:35:11 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/04 20:35:13 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;

import java.util.Scanner;

/**
 * This class demonstrates task 1.3: the use of conditionals in Java.
 */
public class StarWarsChars {
	/**
	 * This is the main method which makes use of conditionals.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Star Wars Universe!");
		System.out.println("Choose your character: 1. Luke Skywalker, 2. " +
				"Darth Vader, 3. Yoda");
		int choice = scanner.nextInt();

		switch (choice) {
			case 1 -> System.out.println("You have chosen Luke Skywalker.");
			case 2 -> System.out.println("You have chosen Darth Vader.");
			case 3 -> System.out.println("You have chosen Yoda.");
			default -> {
				System.out.println("Invalid choice.");
				return; // end the program if the choice is invalid
			}
		}

		scanner.nextLine(); // consume the newline character
		System.out.println("Enter a quote from the character you chose: ");
		String quote = scanner.nextLine();

		if ("Luke Skywalker".equals(getCharacter(choice)) && ("I am a Jedi, " +
				"like my father before me.").equals(quote)) {
			System.out.println("Correct quote for Luke!");
		} else if ("Darth Vader".equals(getCharacter(choice)) && ("I am your " +
				"father.").equals(quote)) {
			System.out.println("Correct quote for Darth Vader!");
		} else if ("Yoda".equals(getCharacter(choice)) && ("You must unlearn" +
				" what you have learned.").equals(quote)) {
			System.out.println("Correct quote for Yoda!");
		} else {
			System.out.println("Incorrect quote.");
		}

		System.out.print("Guess the character's age: ");
		try {
			int age = scanner.nextInt();

			if (choice == 1) {
				if (age != 20) {
					if (age < 20) {
						System.out.println("Luke is older than that.");
					} else {
						System.out.println("Luke is younger than that.");
					}
				} else {
					System.out.println("Correct age for Luke!");
				}
			} else if (choice == 2 && (age >= 40 && age <= 50)) {
				System.out.println("Correct age for Darth Vader!");
			} else if (choice == 3 && !(age > 800)) {
				System.out.println("Correct age for Yoda!");
			} else {
				System.out.println("That doesn't seem right...");
			}
		} catch (NumberFormatException e) {
			System.out.println("403: Bad request!");
		}

		System.out.println("THE END!");
		scanner.close();
	}

	/**
	 * This method returns the name of the character based on the choice.
	 * @param choice The choice of the character.
	 * @return The name of the character.
	 */
	public static String getCharacter(int choice) {
		return switch (choice) {
			case 1 -> "Luke Skywalker";
			case 2 -> "Darth Vader";
			case 3 -> "Yoda";
			default -> "";
		};
	}
}
