import java.util.Scanner; 
public class Pitgame {
	
	static enum Status {CONTINUE, WON, LOST};
	static Status gameStatus;
	private static Hero myHero = new Hero("Hero", 100 , 15 + random.nextInt(6) , 3);
    private static Monster myMonster = new Monster("Goblin", 100 , 13 + random.nextInt(8), 3);
	private static int heroXP = 0;
	boolean battle = true;
		
	public static void main(String[] args){
		// i began by initiating a few variables here and some objects
	gameStatus = Status.CONTINUE;
	
	 Scanner input = new Scanner(System.in);
	int currentloc;
	currentloc = 0;
	Dungeon location = new Dungeon(0); 
	// an array of rooms with exits for navigational purposes
	int[][] roomexits =    {{  3,  2,  7,  1, -1}, // room 0
							{  0, -1, -1, -1, -1}, 
							{ -1, -1,  0,  4, -1}, // room 2
							{ 6,  -1,  5,  0, -1},
							{  2, -1, -1, -1, -1}, // room 4
							{ -1,  3, -1, -1, -1},
							{ -1, -1, -1,  3, -1}, // room 6
							{ -1, -1,  0, -1, -1}};
	// i welcome the player to the game
	System.out.println("Welcome player! \n You have awaken in a pit! \n");
	
	// i begin a loop that lasts until the game is terminated
	
	while(gameStatus == Status.CONTINUE){
		//here i use an If statement that keeps our player "trapped" in the game muahaha
	if ((currentloc < 0)||(currentloc > 7)) {
		
		System.out.println("\n You begin start to fade all of a sudden");
		currentloc = 1;
		System.out.println("\n You have reawaken in the pit! It is unescapable!");
		}
		// here i set it up so each selection my player makes, will update thier rooms

					
	location = new Dungeon(currentloc);
	System.out.print("" + location.getRoom());
		if (currentloc == 7){
		System.out.println("\n There is a man here selling fruits!!\n ");
		
		
				System.out.print("Hey! My name is bob! \n I like to weigh fruits!");
				System.out.print("\n tell me how much that orange in your left hand weighs...?");
				
				int fruit1 = input.nextInt();

				System.out.println("cool beans...\n How about that other one? ");
				
				int fruit2 = input.nextInt();
				
				if (fruit1 == fruit2) {
					System.out.printf("well it looks like %d == %d%n", fruit1, fruit2);
					}
					
				if (fruit1 != fruit2) {
					System.out.printf("well damn dawg %d pounds is nowhere near the same as %d%n pounds", fruit1, fruit2);
					}
					
				if (fruit1 > fruit2) {
					System.out.printf("well then %d pounds weighs a bit heavier than %d%n punds", fruit1, fruit2);
					}
					
				if (fruit1 < fruit2) {
					System.out.printf("well if u got %d pounds in left hand and %d pounds in the right hand, i am sorry for ya right hand!", fruit1, fruit2);
					};
	}
		if (currentloc == 1) {
		executeCombat();
		}
		
		
		
		
	System.out.println("\n where do you go now? \n press q to quit... \n");
	char direction = input.next().charAt(0);
	// i use a switch statement to analyze my players choice, then update the variable 
	switch (direction) {
		case 'n':
		case 'N':
			currentloc = roomexits[currentloc][0];
			break;
		case 'e':
		case 'E':
			currentloc = roomexits[currentloc][1];
			break;
		case 'w':
		case 'W':
			currentloc = roomexits[currentloc][2];
			break;
		case 's':
		case 'S':
			currentloc = roomexits[currentloc][3];
			break;
		case '*':
			System.out.print("You have launched yourself into another dimension! holy smokes!");
		System.out.println("\n There is a man here selling fruits!!\n ");
		
		
				System.out.print("Hey! My name is bob! \n I like to weigh fruits!");
				System.out.print("\n tell me how much that orange in your left hand weighs...?");
				
				int fruit1 = input.nextInt();

				System.out.println("cool beans...\n How about that other one? ");
				
				int fruit2 = input.nextInt();
				
				if (fruit1 == fruit2) {
					System.out.printf("well it looks like %d == %d%n", fruit1, fruit2);
					}
					
				if (fruit1 != fruit2) {
					System.out.printf("well damn dawg %d pounds is nowhere near the same as %d%n pounds", fruit1, fruit2);
					}
					
				if (fruit1 > fruit2) {
					System.out.printf("well then %d pounds weighs a bit heavier than %d%n punds", fruit1, fruit2);
					}
					
				if (fruit1 < fruit2) {
					System.out.printf("well if u got %d pounds in left hand and %d pounds in the right hand, i am sorry for ya right hand!", fruit1, fruit2);
					};
	
			break;
		case 'q':
		case 'Q':
			System.out.println("You suddenly awake in your bed from a bad dream!");
			gameStatus = Status.LOST;
	} // end switch	
	} // end game loop
	} // end main
	
	    public static void executeCombat(){
			
        System.out.printf("\n There is always a pesky goblin in the bathroom!\n");
        while(battle)
        {
        
            combatOptions();
            combatStats();
            int choice = input.nextInt();
            choice1(choice);
            choice2(choice);
            choice3(choice);
            choice4(choice);
            if (choice !> 0 && !< 5){
					System.out.println("This is not an option. you must fight or DIE!");
			}
            battle = checkStatus(battle);

         
          
        }//end while
      }//end executeCombat
	  // choice methods
	  public static void choice1(int choice)
      {
          if (choice == 1)
          {
              executeAttack();
          }
      }

      public static void choice2(int choice)
      {
          if (choice == 2)
          {
              executeSpell();
          }
      }

      public static void choice3(int choice)
      {
          if (choice == 3)
          {
              myHero.chargeMana();
            }
      }

      public static void choice4(int choice)
      {
          if (choice == 4)
          {
              if (heroXP % 3 == 0 && heroXP != 0)
              {
                  myHero.setHealth(myHero.getHealth()+10);
                  myHero.setMana(myHero.getMana()+ 5);
                  myHero.setAttack(myHero.getAttack()+2);
                  heroXP -= 3;
                  System.out.println("You are getting stronger! HP +10 MP +5 ATK +2");
              }
              else
              {
                  System.out.println("You dont have enough XP yet!.");
              }
          }
      }

		// attack and spell methods
      public static void executeAttack()
      {
          myHero.attack(myMonster);
          myMonster.attack(myHero);
      }

      public static void executeSpell()
      {
          if (myHero.getMana() >= 3)
          {
              myHero.castSpell(myMonster);
              myMonster.attack(myHero);
              myHero.setMana(myHero.getMana() - 3);
          }
          else
          {
              System.out.println("You dont have enough mana!");
          }
      }//end castSpell

      public static void combatOptions()
      {
          System.out.printf("\nOption 1: Use Ugly Stick!\nOption 2: Cast Spell\nOption 3: Charge Mana\nOption 4: Level Up!\n");
      }

      public static void combatStats()
      {
        System.out.println(myHero);
        System.out.println(myMonster);
      }

      public static boolean checkStatus(boolean battle)
      {
          //If hero health is 0 or below exit loop
          if (myHero.getHealth() <= 0)
          {
              System.out.printf("\nYou got killed bro!\n");
				gameStatus = Status.LOST;
          }
          //if monster health is 0 or below then exit loop
          else if (myMonster.getHealth() <= 0)
          {

              battle = false;
              heroXP += myMonster.getXP();
              System.out.printf("\nThe monster dies on the toilet and you flush him into the abyss\n");
              myHero.setHealth(myHero.getHealth()+10);
              myMonster.setHealth(100);

          }
          return battle;
        }//end checkStatus
} // end class