/* Demonhunter
author: Barrington K Hebert
date:  9/8/2017
Computer Science! 1583 Dr. Suma */
import java.util.Scanner;

	public class CombatCalculator6
	{
			public static void main(String[] args) 
			{
				Scanner input = new Scanner(System.in);
				
				int goblinHP = 100;
				int goblinatk = 15;
				
				int hero = 100;
				int heroatk = 12;
				int heromp = 0;
				
				int enemy = 1;
				
				while (enemy > 0) {
			
					System.out.println("Goblin \n HP: 100 \n Player One \n HP:100 \n MP: 100");
					System.out.print("Combat Options: \n 1.) Sword Attack \n 2.) Cast Spell \n 3.) Charge Mana \n 4.) Run Away");
					System.out.println("\n What will you do in this terrible situation?");
			
					int move = input.nextInt();
				
					if (move == 1) 
					{
						System.out.println("You strike the Goblin with an ugly stick for 12 damage");
						goblinHP = goblinHP - heroatk;
						System.out.printf("Goblin Health is now %d!%n", goblinHP);
					}
						else {
						if (move == 2)
						{
							goblinHP = goblinHP / 2;
							System.out.printf("Goblin HP : %d%n", goblinHP );
							System.out.println("You cast the weaken spell on the monster");
						}
							else {
							if (move == 3)
							{
								heromp = heromp + 1;
								System.out.printf("hero MP: %d%n", heromp);
								System.out.println("You focus and charge your magic power.");
							}
								else {
								if (move == 4)
								{
									System.out.println("You run away!");
									enemy = enemy - 1;
								}
					
									else { 
					 
											System.out.println("I dont understand that command.");
										 }
					
									}
								}
							}
					if (goblinHP <= 0)
					{
					enemy = enemy - 1;
					System.out.println("You defeated the Goblin!");
					}
								}
			}

					
	}
				
		