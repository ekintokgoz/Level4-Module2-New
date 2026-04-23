package _06_Console_Store;

import java.util.ArrayList;

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
	private ArrayList <T> cart;

	public Cart() {
		cart = new ArrayList<T>();
	}

	// Adds an item to the cart
	public void add(T item) {		
		cart.add(item);
	}

	public String getContents() {
		StringBuilder sb = new StringBuilder();
		if(cart.size()>0) {
			for(int i = 0; i < cart.size(); i++) {			
				sb.append(((i+1) + ". " + cart.get(i).toString())+"\n");
			}		
			return sb.toString();
		}else {
			return ("Cart is empty");
		}
	}

	// Displays everything currently in the cart
	public void showCart() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < cart.size(); i++) {
			if(cart.get(i) instanceof Food){

				panel.add(((Food) cart.get(i)).getFood());
			}
		}
		frame.pack();
	}

	public int length() {
		return cart.size();
	}

	public void remove(int num) {
		if(num < cart.size()) {
			cart.remove(num);
			System.out.println("Successfully removed item!");

		}else {
			System.out.println("Couldn't remove, invalid number.");
		}
	}
}
