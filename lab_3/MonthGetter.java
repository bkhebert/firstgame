/* Barrington Hebert
 * 9.13.2017
 * 
 *
 */
  import java.util.Scanner;
  
  public class MonthGetter{
		public static void main (String[] args){
			Scanner input = new Scanner(System.in);
			int month;
			
			do {
				System.out.println("Enter a month(1-12)");
				month = input.nextInt();
				
		}// end of do-while looop
			while (!((month >- 1) && (month <=12)));
			System.out.println("You picked month " + month);
		} // end main
  } // end class