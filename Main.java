import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = scan.nextLine();
		
		System.out.print("What is your name? ");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Your name is " + name);
		
		scan.close();
	}
}
	