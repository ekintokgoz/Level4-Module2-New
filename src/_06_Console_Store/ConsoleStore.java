package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and
	 * the classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are
	 * also free to add any additional methods or classes in Console Store that
	 * might be helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can
	 * be food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should
	 * have its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove
	 * items, view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have
	 * enough money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the
	 * amount from their stipend, show them the pictures of what they bought and
	 * print out a receipt showing their name, the individual prices of the
	 * items and their total.
	 */
	Cart <Food> cart = new Cart<Food>(); 
	Scanner scanner = new Scanner(System.in);
	int stipend = 25;

	public static void main(String[] args) {
		ConsoleStore cs = new ConsoleStore();
		cs.run();
	}

	public void run() {
		String userChoice = "";
		do {
			System.out.println("What do you want to do? (Add item, Remove item, View items, Check out)");
			userChoice = scanner.nextLine();
			switch(userChoice) {
			case "Add item":
				System.out.println("What do you want to add to cart? (Candy Corn, Cheerios, Froot Loops, Gummyworms");
				String itemChoice = scanner.nextLine();
				addItem(itemChoice);
				break;
			case "Remove item":
				showItems();
				System.out.println("Which number do you want to remove from cart?");
				int numberChoice = Integer.parseInt(scanner.nextLine());
				cart.remove(numberChoice-1);
				break;
			case "View items":
				showItems();
				break;
			default:
				System.out.println("That is not an option. Try again.");
				break;
			}



		} while (!userChoice.equals("Check out"));
	}

	public void addItem(String item) {
		switch(item) {
		case "Candy Corn":
			cart.add(new CandyCorn());
			System.out.println("Successfully added Candy Corn to cart");
			break;
		case "Cheerios":
			cart.add(new Cheerios());
			System.out.println("Successfully added Cheerios to cart");
			break;
		case "Froot Loops":
			cart.add(new FrootLoop());
			System.out.println("Successfully added Froot Loops to cart");
			break;
		case "Gummyworms":
			cart.add(new GummyWorm());
			System.out.println("Successfully added Gummyworms to cart");
			break;
		default:
			System.out.println("Not an available item.");
			break;
		}	
	}
	
	public void showItems() {
		System.out.println(cart.getContents());

	}
}
