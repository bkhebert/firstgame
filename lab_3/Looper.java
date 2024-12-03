/* Barrington K Hebert
 *9.13.2017
 *
 *
 */
 import java.util.Scanner;
 
		public class Looper {
			public static void main (String[] args){
				Scanner input = new Scanner(System.in);
				int iterations;
				
				System.out.println("How many iterations would you like?");
				iterations = input.nextInt(); // next input user enters will be saved to iterations
				
				for (int counter = 0; counter < iterations; counter++){
				System.out.println(" counter = " + counter); //a string named counter will be added after quote
				} //end for group
			} // end main
		} // end class