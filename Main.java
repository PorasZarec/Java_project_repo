//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * String name = "Bro";
		 * boolean result = name.equalIgnoreCase("Bro"); Ignore caps
		 * int result = name.leght(); int length
		 * char result = name.charAt(0); char index
		 * int result = name.indexOf("B"); return int index
		 * boolean result = name.isEmpty(); check if string is empty
		 * String result = name.toUpperCase();
		 * String result = name.toLowerCase(); 
		 * String result = name.trim(); cls white space
		 * String result = name.replace('o','a'); Bra
		 * */
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hellow " + name);
	
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " Years old");
				
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height + "cm tall");
		
		
		
	}
}