import java.util.Scanner;

/**
 * This class takes imput from user in terminal and prints it out.
 *
 */
public class Assignment1_1 {
    /**
     * method uses a scanner to take input from user and prints out a message
     * first it prints hello, then it asks for a user input and then it prints hello with whatever the user inputed. 
     *
     * @param args A String containing the arg input
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); 
		Scanner input = new Scanner(System.in);
		String username = input.nextLine(); 
		System.out.println("Hello " + username); 
    }
}