package _06_Console_Store;

import javax.swing.JLabel;

public class FrootLoop extends Food{
	public FrootLoop() {
		this.item = "frootLoops.jpeg";
	}
	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 8;
	}
}
