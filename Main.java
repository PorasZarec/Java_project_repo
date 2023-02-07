import javax.swing.ImageIcon;
import javax.swing.JFrame;

//import java.util.Scanner;
//import java.util.Random;
//import java.util.ArrayList;
// import javax.swing.JOptionPane;
// import javax.swing.ImageIcon;
// import javax.swing.Jframe;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * ArrayList<String> food = new ArrayList<String>();
		 * 
		 * food.add("Pizza");	
		 * food.add("hamburger");
		 * food.add("hotdog");
		 * */
		
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
		 * 
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hellow " + name);
	
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " Years old");
				
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height + "cm tall");
		
		hello();
		int x = 2,y = 3;
		
		double result = add(x,y);
		
		System.out.println(result);
		
		String myString = "Bro";
		int myInt = 18;
		boolean myBoolean = true;
		char myChar = '@';
		double myDouble = 1000;
		float myFloat = 300;
		
		System.out.printf("My string is %s\n",myString);
		System.out.printf("My integer is %d\n", myInt);
		System.out.printf("My boolean is %b\n", myBoolean);
		System.out.printf("My character is %c\n", myChar);
		System.out.printf("My float is %f", myFloat);
		System.out.printf("My double is %f\n", myDouble);
		
		[width]
		System.out.printf("Hello %10s", myString);
		
		[precision]
		System.out.printf("You have this much money %.2f",myDouble);
		
		[flags]
		- : lefi-jusify
		+ : output a numeric sign for a value
		0 : numeric values are zero padded
		, : comman grouping seperator if number > 1000
		
		System.out.printf("You have this much money %f");
		
		Car myCar = new Car();
		
		System.out.println(myCar.make);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		
		myCar.drive();
		myCar.brake();
		

	}
	
	static void hello() {
		System.out.println("Hellow");
	}
	
	static double add(double num1,double num2) {
		
		double result = num1 + num2;
		
		return result;
	}
  */

    // Human human1 = new Human("Rick",65,70);
    // Human human2 = new Human("Morty",16,50);
    
    // human1.drink();
    // human2.eat();
    /*
    JFrame frame = new JFrame();//creates a frame
    
    frame.setTitle( "JFrame title goes here"); //sets title of frame
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
   
    frame.setResizable(false); //prevent frame from being resized
    
    frame.setSize(420, 420); // sets the x-dimension, and y-dimension of frame
    
    frame.setVisible( true); //make frame visible

    ImageIcon image = new ImageIcon("LOGO.PNG"); // create an ImageIcon
    frame.setIconImage(image.getImage()); // change icon of frame

    frame.getContentPane().setBackground(new Color(0,0,0)); // Change color of background
    
    */ 
    
    myFrame myFrame = new myFrame();
    
  }
}