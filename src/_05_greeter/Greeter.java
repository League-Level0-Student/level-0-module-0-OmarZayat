package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String noob = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "hi " + noob + "!");
}
}