import java.util.Scanner;

public class NewGitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		String input;
		
		System.out.print("Please enter your first name: ");
		input = scnr.nextLine();
		
		System.out.println("Your first name is: " + input);
		
		scnr.close();
		
		

	}

}
