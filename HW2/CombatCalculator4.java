/* Demonhunter
author: Barrington K Hebert
date:  9/8/2017
Computer Science! 1583 Dr. Suma */
import java.util.Scanner;

	public class CombatCalculator4
	{
			public static void main(String[] args) 
			{
				Scanner input = new Scanner(System.in);
				
				int goblinHP = 100;
				int goblinatk = 15;
				
				int hero = 100;
				int heroatk = 12;
				int heromp = 0;
			
				System.out.println("Goblin \n HP: 100 \n Player One \n HP:100 \n MP: 100");
				System.out.print("Combat Options: \n 1.) Sword Attack \n 2.) Cast Spell \n 3.) Charge Mana \n 4.) Run Away");
				System.out.println("\n What will you do in this terrible situation?");
			
				int move = input.nextInt();
				
				if (move == 1) 
				{
					System.out.println("You strike the Goblin with an ugly stick for 12 damage");
				}
					else {
					if (move == 2)
					{
						System.out.println("You cast the weaken spell on the monster");
					}
						else {
						if (move == 3)
						{
							System.out.println("You focus and charge your magic power.");
						}
							else {
							if (move == 4)
							{
								System.out.println("You run away!");
							}
				
								else { 
			     
										System.out.println("I dont understand that command.");
									 }	
							}
						}
					}
			}
	}