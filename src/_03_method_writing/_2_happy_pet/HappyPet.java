package _03_method_writing._2_happy_pet;

import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {

	public static void main(String[] args) {

		Random rand = new Random();

		int howHappy = 50;

		int animal = JOptionPane.showOptionDialog(null, "Which pet would you like to buy?", "", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Mexican Redknee Tarantula", "Alligator", "Fennec Fox" }, null);

		while (true) {

			int task = JOptionPane.showOptionDialog(null, "What would you like to do?", "", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Water your pet",
							"Put your pet in a large space with LED lighting for a day/night cycle", "Feed your pet" },
					null);

			if (task == 0) {
				if (animal == 0) {
					howHappy = howHappy - 25;
					JOptionPane.showMessageDialog(null,
							"Your tarantula is furious that you splashed water on it.\nIt raises its legs, exposes"
									+ " its fangs, and flicks tiny barbed hairs at you.\nPet Happiness Level: "
									+ howHappy);

				} else if (animal == 1) {
					howHappy = howHappy + 25;
					JOptionPane.showMessageDialog(null,
							"Your alligator is elated that you splashed water on it.\nIt vocalizes.\nPet Happiness Level: "
									+ howHappy);

				} else if (animal == 2) {
					if (rand.nextBoolean()) {
						howHappy = howHappy + 25;
						JOptionPane.showMessageDialog(null,
								"Your fennec fox is elated that you splashed water on it.\nIt purrs and wags its tail.\n"
										+ "Pet Happiness Level: " + howHappy);

					} else {
						howHappy = howHappy - 25;
						JOptionPane.showMessageDialog(null,
								"Your fennec fox is furious that you splashed water on it.\nIt arches its back, angles"
										+ " its ears back, bristles the hairs at the base of its tail, scratches with its feet,"
										+ " screeches very loudly, causing you permanent hearing loss, pounces on you, and bites"
										+ " your finger off.\nPet Happiness Level: " + howHappy);

					}
				}
			} else if (task == 1) {
				if (animal == 0) {
					howHappy = howHappy + 25;
					JOptionPane.showMessageDialog(null,
							"Your tarantula loves its new terrarium.\nIt happily moves into it.\nPet Happiness Level: "
									+ howHappy);
				} else if (animal == 1) {
					howHappy = howHappy - 25;
					JOptionPane.showMessageDialog(null,
							"Your alligator hates its new terrarium.\nIt would rather be somewhere wet and humid. It begrudgingly moves into it, but annoys you and doesn't let you concentrate on your online games by growling, hissing, snorting, and clicking its jaws together repeatedly all day.\nPet Happiness Level: "
									+ howHappy);

				} else {
					JOptionPane.showMessageDialog(null,
							"Your fennec fox doesn't really care.\nIt really doesn't.\nPet Happiness Level: "
									+ howHappy);

				}

			} else {
				howHappy = howHappy + 25;
				JOptionPane.showMessageDialog(null,
						"It is now the happiest creature alive.\nIt will love you forever and ever unless you do something really bad.\nPet Happiness Level: "
								+ howHappy);

			}

			if (howHappy == 0) {
				if (animal == 0) {
					JOptionPane.showMessageDialog(null,
							"Your Mexican redknee tarantula hates you. It breaks out of its enclosure at 3 AM, tracks you down using its sense of smell, and murders you. Game over.");

				}

				if (animal == 1) {
					JOptionPane.showMessageDialog(null,
							"Your alligator hates you. It breaks out of its enclosure at 3 AM, tracks you down using its sense of smell, and murders you. Game over.");

				}
				if (animal == 2) {
					JOptionPane.showMessageDialog(null,
							"Your fennec fox hates you. It breaks out of its enclosure at 3 AM, tracks you down using its sense of smell, and murders you. Game over.");

				}
				break;

			}

			if (howHappy == 100) {
				if (animal == 0) {
					JOptionPane.showMessageDialog(null,
							"Your Mexican redknee tarantula loves you. It breaks out of its enclosure at 3 AM, tracks you down using its sense of smell, and tries to give you a hug, accidentally biting and killing you. Game over.");

				}

				if (animal == 1) {
					JOptionPane.showMessageDialog(null,
							"Your alligator loves you. It breaks out of its enclosure at 3 AM, tracks you down using its sense of smell, and tries to give you a hug, standing up on its back feet, toppling over, and crushing you, killing you. Game over.");

				}
				if (animal == 2) {
					JOptionPane.showMessageDialog(null,
							"Your fennec fox loves you. It breaks out of its enclosure at 3 AM, tracks you down using its sense of smell, and tries to give you a hug, startling you asleep and giving you a heart attack. Game over.");

				}
				break;

			}

		}

	}

	// 5. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}