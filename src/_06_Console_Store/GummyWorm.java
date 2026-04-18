package _06_Console_Store;

import javax.swing.JLabel;

public class GummyWorm extends Food{
	public GummyWorm() {
			this.item = "gummyWorm.jpeg";
	}
	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Gummyworms";
	}
}
