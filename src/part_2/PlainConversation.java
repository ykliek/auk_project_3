/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   PlainConversation.java                       :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/04 21:33:49 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/04 21:33:51 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_2;

import java.util.Scanner;

public class PlainConversation {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the club body!");
		System.out.println("First rule of the club is: you do not talk " +
				"about the club.");
		System.out.println("Second rule of the club is: you DO NOT talk " +
				"about the club.");
		System.out.println("Third rule of the club is: for you to decide.");

		while (true) {
			try {
				System.out.println("What is your age?");
				int age = scanner.nextInt();

				if (age < 0) {
					throw new Exception();
				}

				if (age <= 6) {
					System.out.println("Home, walk and kindergarten.");
				} else if (age <= 17) {
					System.out.println("School, homework and friends.");
				} else if (age <= 22) {
					System.out.println("University, parties and friends.");
				} else if (age < 60) {
					System.out.println("Work, family and friends.");
				} else {
					System.out.println("Retirement, family and friends.");
				}
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("403: Bad Request!");
			}
		}

		System.out.println("Goodbye! Have a froody day.");
		scanner.close();
	}
}
