import java.util.Scanner;

public class pastaBar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] ingredients = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina",
				"Piletina", "4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix",
				"Pecurke", "Kutija" };
		String[] regularCustomers = { "0631111111", "0632222222", "0633333333", "0644444444", "0655555555",
				"0666666666" };
		int[] price = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

	}

	public static int chosenIngredients(String[] ingredients, String customerIngredient) {
		int i = 0;
		int noOfIngredients = 100;
		for (i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equalsIgnoreCase(customerIngredient)) {
				noOfIngredients = i;
				return noOfIngredients;
			}
		}
		return noOfIngredients;

	}
}
