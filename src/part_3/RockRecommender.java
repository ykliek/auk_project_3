/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   RockRecommender.java                         :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/04 21:33:36 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/04 21:33:37 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_3;

import java.util.Scanner;

public class RockRecommender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hey! Let's rock! (60's only)");

		System.out.print("Which style of rock you like? (e.g., psychedelic," +
				" blues, folk, hard rock) ");
		String style = scanner.nextLine().toLowerCase();

		System.out.print("Who's your favorite modern artist or band? ");
		String modernArtist = scanner.nextLine().toLowerCase();

		System.out.print(
				"Any specific mood or tempo preference? (e.g., upbeat, " +
						"melancholic, fast, slow) [Type 'none' if no " +
						"specific preference] ");
		String mood = scanner.nextLine().toLowerCase();

		switch (style) {
			case "psychedelic" -> {
				if (modernArtist.contains("frusciante")) {
					System.out.println("You might enjoy 'The Doors' or " +
							"'Jimi Hendrix Experience'.");
				} else {
					System.out.println("'Pink Floyd' or 'Grateful Dead' " +
							"would be a great fit for psychedelic lovers.");
				}
			}
			case "blues" -> {
				if ("upbeat".equals(mood)) {
					System.out.println(
							"'The Rolling Stones' early albums have a " +
									"strong blues influence and are " +
									"quite upbeat.");
				} else {
					System.out.println(
							"You might appreciate 'Cream' or 'Led Zeppelin's " +
									"early blues-inspired tracks.");
				}
			}
			case "folk" -> {
				if (modernArtist.contains("mumford")) {
					System.out.println(
							"'The Byrds' or 'Simon & Garfunkel' would" +
									" resonate with you.");
				} else {
					System.out.println(
							"'Bob Dylan' is a must-listen for folk " +
									"rock enthusiasts.");
				}
			}
			case "hard rock" -> {
				if ("fast".equals(mood)) {
					System.out.println("'The Who' or early 'Led Zeppelin' " +
							"would be right up your alley.");
				} else {
					System.out.println("Give 'Deep Purple' a try!");
				}
			}
			default ->
					System.out.println(
							"The '60s were a treasure trove of rock bands." +
									" Maybe start with 'The Beatles' and" +
									" explore from there!");
		}

		System.out.println("Goodbye! Have a froody day.");
		scanner.close();
	}
}
