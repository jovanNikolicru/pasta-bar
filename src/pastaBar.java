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
		int totalPrice=0;
		int totalPriceDiscount=0;
		System.out.println("**********Dobrodosli u Pasta Bar Izvolite!!**********");
		System.out.println("*****************************************************");
		System.out.println("***********Sami birate svoju idealnu pastu***********");
		System.out.println("*****************************************************");
		System.out.println("******Kada odaberete sastojke kucajte--Poruci--******");
		System.out.println("*****************************************************");
		String customerIngredient = "";
		
	
		while(!customerIngredient.equalsIgnoreCase("poruci")) {
			System.out.println("Izaberite sastojak");
			customerIngredient=s.nextLine();
			
			System.out.println("*****************************************************");
			
			for(int i=0;i<price.length;i++) {
				if (i==chosenIngredients(ingredients, customerIngredient)) {
					totalPrice=totalPrice+price[i];
				}
			
			}

		}if (customerIngredient.equals("poruci")) {
			System.out.println(">>>>>>>>>>>>Vasa porudzbina je zabelezena<<<<<<<<<<<<<");
			System.out.println("Cena je " + totalPrice + " rsd");
			System.out.println("******************************************************");
			
		}System.out.println("Unesite broj telefona");
		String phoneNumber=s.next();
			System.out.println("******************************************************");
			if(isRegularCustomer(regularCustomers, phoneNumber)==true) {
				totalPriceDiscount=totalPrice-(totalPrice*10/100);
				System.out.println("Kao redovna musterija ostavrujete popust 10%");
				System.out.println("Cena je " + totalPriceDiscount + " rsd");
			}else {
			System.out.println("Postanite nasa redovna musterija i ostvaricete popust od 10%");
			}
			System.out.println("*****************************************************");
			System.out.println("******************Hvala Vam na poseti****************");
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

	public static boolean isRegularCustomer(String[] regularCustomers, String phoneNumber) {
		int i;
		for (i = 0; i < regularCustomers.length; i++) {
			if (regularCustomers[i].equalsIgnoreCase(phoneNumber)) {
				return true;
			}

		}
		return false;
	}
}
