/* Barrington
 * 9.13.2017
 *
 * 
 */ 
 
import java.util.Scanner;

	public class NumberValidator {
			public static void main(String[] args){
				Scanner input = new Scanner(System.in);
				int integer;
				// asks for a number between one and ten and prints if it is valid or not
				System.out.println("Enter a number between 0 and 10");
				integer = input.nextInt();
				
				if ((integer>0) & (integer <10)){
					System.out.println("Valid Number");
				} 
				
				else {
					System.out.println("Not Valid Number");
				}
				
				// asks for a number that is divisible by either 2 or 3 Then validate
				System.out.println("Enter a number that is divisible by either 2 or 3");
				integer = input.nextInt();
				
				if (((integer % 2) == 0) || ((integer % 3) == 0)){
					System.out.println("Valid Number");
				}
				
				else {
					System.out.println("Invalid Number");
				}
				//asks user for a number that is either NEGATIVE and EVEN or POSITIVE and ODD
				
				System.out.println("Enter a number that is negative and even or positive and odd");
				integer = input.nextInt();
				
				if ( ((integer < 0) && ((integer % 2) == 0)) ||
				     ((integer > 0) && ((integer % 2) == 1)) ){
					System.out.println("Valid Number");
				}
				else {
					System.out.println("Invalid Number");
				}
				
				// asks for a number that is divisible by either 5 or 2 but not both
				System.out.println("Enter a number that is diviible by 2 or 5 but not both");
				integer = input.nextInt();
				
				if ((((integer % 2) == 0) || ((integer % 5) == 0)) && !((integer % 10) == 0)){
					System.out.println("Valid Number");
				}
				
				else {
					System.out.println("Invalid Number");
				}
				
				//???
				System.out.println("Please enter a positive odd number");
				integer = input.nextInt();
				
				if (!((integer % 2) == 0) && !(integer <= 0)){
					System.out.println("Valid Number");
				}
				else {
					System.out.println("Invalid Number");
				}
				
			} // end main		
	} //end class
 