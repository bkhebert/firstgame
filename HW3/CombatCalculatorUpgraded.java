/* Demonhunter
author: Barrington K Hebert
date:  9/8/2017
Computer Science! 1583 Dr. Suma */
import java.util.Scanner;
import java.util.Random;

	public class CombatCalculatorUpgraded
	{
		static Scanner input = new Scanner(System.in);
		static int action;
		static int monsterHP   = 100;
		static int monsteratk  = 15;
		static int hero       = 100;
		static int uglystick    = 12;
		static int heromp     = 0;
		static int enemy      = 1;
		static int herostats  = 20;
		static int monsterxp   = 15;
		static String t="troll";
		static String o="orc";
		static String g="goblin";
	    static String monsterName;
	    static enum Status {CONTINUE, LOST, WON, RUN, QUIT};
	    static Status gameStatus = Status.CONTINUE;
	    static int choice;
	    
			public static void main(String[] args) 
			{	
				
				CreateHero();
				System.out.printf("Hero has been created! %n Welcome to Hell! Fight For Survival %n");
				CreateMonster();
				System.out.printf("You encountered a %s%n", monsterName);
				
				while(gameStatus == Status.CONTINUE)
		        {
		         CombatMethod();
		         if (gameStatus == Status.RUN)
		            {
		                CreateMonster();
		                System.out.printf("You encountered a %s%n",monsterName);
		                gameStatus = Status.CONTINUE;
		            }
		          else
		        	  if(gameStatus == Status.LOST)
		            {
		                System.out.printf("You have Died\n");
		            }
		              else if(gameStatus == Status.WON)
		              {
		               System.out.printf("You Won!!%n");
		              }
		              else if (gameStatus == Status.QUIT)
		              {
		                  System.out.printf("You walk out of hell the same way you walked in%n");
		              }
		        }
				
								
			} // end main
			// begin list of methods
			public static void CreateHero(){ // this is the Create Hero Method
		
				while (herostats > 0) {
				System.out.printf("Welcome Player! Please Assign Stat Points For Your Character! %n");
				System.out.printf(" Press 1 = HP +10 %n Press 2 = ATK +1 %n Press 3 = MP +3 %n");
				System.out.printf("Stat Points %d%n,", herostats);
				action = input.nextInt();
				if (action == 1)
				{
					hero        += 10;
					herostats   -= 1;
				}
				else if (action == 2)
				{
					uglystick += 1;
					herostats -= 1;
				}
				else if (action == 3)
				{
					heromp += 3;
					herostats -= 1;
				}
				else if (!(action>=1)||(action<=3))
				{
					System.out.printf("Please pick 1-3 %n");
				}
				} //end whille loop Create Hero 
			
			} // End Create Hero
			public static void CreateMonster() // This is the monster generating method
			{
				Random randomGenerator = new Random();
		        int x = randomGenerator.nextInt(2);
		        int y = randomGenerator.nextInt(50);// goblin + orc
		        int z = randomGenerator.nextInt(100);// troll 
		        int w = randomGenerator.nextInt(10);// attack 
		        if((x>=0)||(x<=2))
		        {
		            if(x==0)
		            {
		                monsteratk = 8 + w;
		                monsterHP = 100+ x;
		                monsterName = g;
		                
		                
		            }
		            else if(x==1)
		            {
		                monsteratk = 12 + w;
		                monsterHP = 300+ y;
		                monsterName = o;
		              
		            }
		            else if (x==2)
		            {
		                monsteratk = 15 + w;
		                monsterHP = 500 + z;
		                monsterName = t;
		            } 
		        } // end if else of monsters	
			} // end Random Monster Generator
	 public static void CombatMethod() // this is the method used to simulate combat
    {
			        gameStatus = Status.CONTINUE;
			        System.out.printf("\n An %s comes out from the shadows... %n%s health:%d, %s attack:%d", monsterName,monsterName, monsterHP,monsterName, monsteratk);
			        System.out.printf("\nHero Health:%d, Hero Attack:%d, Hero MP:%d,",hero,uglystick,heromp);
			        System.out.printf("\n1)Ugly-Stick Attack for:%d\n2)Charge MP \n3)Magic Attack \n4)Run Away\n5)Quit\n",uglystick);
			        System.out.printf("Your Choice:");
			        int option = input.nextInt();
			        gameStatus = Status.CONTINUE;
			        if((option >=1)||(option <=5))
			        {
			            if(option == 1)
			            {
			                Random randomGenerator = new Random();
			                int s = randomGenerator.nextInt(uglystick);
			                monsterHP -= s;
			                System.out.printf("You lunge towards the %s with an ugly stick %n",monsterName);
			                System.out.printf("\nThe %s hit you for %d damage\n", monsterName,monsteratk);
			                System.out.printf("\nYou hit the %s for:%d\n ",monsterName ,uglystick);
			                hero -= monsteratk;
			            }
			            else if(option == 2)
			            {
			                heromp +=1;
			                System.out.printf("You charged your magic\n");
			                System.out.printf("\nThe %s hit you for %d damage\n", monsterName,monsteratk);
			                hero -= monsteratk;
			            }
			            else if (option ==3)
			            {
			                if(heromp>=3)
			                {
			                    monsterHP = monsterHP / 2;
			                    heromp -=1;
			                    System.out.printf("You weakened the monster!%n");
			                }
			                else if(heromp<3)
			                {
			                    System.out.printf("You need more MP%n");
			                }
			            }
			            else if(option == 4)
			            {
			                System.out.println("You ran away\n");
			                gameStatus = Status.RUN;
			                
			                
			            }
			            else if (option == 5)
			            {
			                System.out.printf("Would You Like to Quit? \n Yes = 1\n No = 2\n");
			                choice = input.nextInt();
			                if(choice==1)
			                {
			                    System.out.println("Good Bye");
			                    gameStatus = Status.QUIT;
			                }
			                else if(choice==2)
			                {
			                    gameStatus = Status.CONTINUE;
			                }
			            }
			        }
			        else if (!(option>=1)||(option<=5))
			        {
			            System.out.printf("Wrong choice use 1-4");
			        }
			        if(gameStatus == Status.RUN)
			        {
			            gameStatus = Status.RUN;
			        }
			        else if(hero<=0)
			        {
			            gameStatus = Status.LOST;
			        }
			        else if(monsterHP<=0)
			        {
			            gameStatus = Status.WON;
			            
			        }
			    } // end combatmethod
			} // end everything!!!
					
	
				