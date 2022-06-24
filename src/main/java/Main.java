/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner; 

public class Main {

    public static void main(String[] args ){
	Scanner abObj = new Scanner(System.in);  // Create a Scanner object
	
	System.out.println("Please enter your name");

	String name = abObj.nextLine();  // Read user input
	
	if(name.equals("Alice") || name.equals("Bob")) {
		System.out.println("Hi " + name + " nice to meet you!");
	}
    }
}
