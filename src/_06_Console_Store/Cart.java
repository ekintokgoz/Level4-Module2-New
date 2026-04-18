package _06_Console_Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T extends Food> {
	private T[] cart;

	public Cart() {
		cart = (T[]) new Food[5];
	}

	// Adds an item to the cart
	public void add(T item) {
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				cart[i] = item;
				return;
			}
		}
		JOptionPane.showMessageDialog(null,
				"Your cart is full!\nNo more than 5 items");
	}
	
	public String getContents() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < cart.length; i++) {
			sb.append(((i+1) + ". " + cart[i].toString())+"\n");
		}
		
		return sb.toString();
	}

	// Displays everything currently in the cart
	public void showCart() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < cart.length; i++) {
			if(cart[i] instanceof Food){
				if(cart[i] != null) {
					panel.add(((Food) cart[i]).getFood());
				}
			}
		}
		frame.pack();
	}

	public int length() {
		return cart.length;
	}
}
