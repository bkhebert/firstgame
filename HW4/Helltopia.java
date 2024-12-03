/* 
	Barrington K Hebert
	Dr. Summa!
	HW 4 - HELLTOPIAAA!!!!! ROAR!
	10-20-2017
*/

import java.util.Scanner;

public class Helltopia{
	
	static enum Status {CONTINUE, WON, LOST};
	static Scanner input = new Scanner(System.in);
	static Status gameStatus;
	
	public static void main(String[] args){
	
	gameStatus = Status.CONTINUE;
	String[] roomdescription = new String[8]; // declaration of an array of room descriptions
	
	//list of room descriptions begins here
	roomdescription[0] = "\n\nYou are in a restroom with only one toilet. Hundreds of men, women \n"; // RESTROOM
	roomdescription[0] += "animals, aliens and multidimentional beings await behind it.\n";
	roomdescription[0] += "It will be several centuries before you can use this toilet...\n\n\n";
	roomdescription[0] += "There is an exit North of here\n Where do you go?\n"; // complete description of RESTROOM
	roomdescription[1] = "\n\nYou are in a large open area. There are billions of demons flying \n"; // Concert Hall
	roomdescription[1] += "in circles, occasionally colliding and crashing into each other. \n";
	roomdescription[1] += "Some demons have fallen to the ground, and thier soul-less bodies \n";
	roomdescription[1] += "lie limpless... at the center of it all, there appears to be a \n";
	roomdescription[1] += "technical death metal band playing. \n The intensity of the music orchestrates the chaos...\n\n\n";
	roomdescription[1] += " There is a path that leads to the north \n Where do you go?\n"; // complete Concert Hall
	roomdescription[2] = "\n\nYou enter a room where millions of souls await to be judged. It smells like a hospital\n"; // Waiting Room
	roomdescription[2] += "and looks like a DMV. There is a young lady giving out tokens...\n\n\n";
	roomdescription[2] += "There are portals to the north and to the east.\n";
	roomdescription[2] += "There also appears to be a restroom conveniently located to the south\n Where do you go?\n"; // Complete Waiting Room
	roomdescription[3] = "\n\nYou are outside. There is an elevator leading up to what is presumably heaven. \n"; // elevator to heaven
	roomdescription[3] += "You need a token to gain access into the elevator... \n";
	roomdescription[3] += "A cold breeze continuously gives you discomfort here...\n\n\n";
	roomdescription[3] += "The portal you rode in on is to the west...\n Where do you go? \n"; // elevator to heaven
	roomdescription[4] = "\n\nYou enter a valley in which one large demon throws trilions upon trillions of body parts into \n";//tprtire square
	roomdescription[4] += "a blender. The body parts look like they are still alive as they atempt to wriggle away. \n";
	roomdescription[4] += "the demon is too busy to notice you...\n\n\n";
	roomdescription[4] += "There is a gate to the east and a small path heading south of here...\nWhere do you go?\n"; // torture square
	roomdescription[5] = "\n\nYou enter a room with a vast dark pit at the center. Screams can be heard from within \n"; // hell pits
	roomdescription[5] += "There is a small wooden sign that says the answers to all your questions lie at the bottom of the pit \n";
	roomdescription[5] += "The screams are beginning to fade; Are they... still falling?\n\n\n ";
	roomdescription[5] += "There are gates to the east and west. \n a large gate is to the north.\n the portal glows to the south.\n Where do you go?\n"; //hell
	roomdescription[6] = "\n\nYou enter a room in which there is a large chalkboard that stretches upwards for miles. \n"; // think tank
	roomdescription[6] += "The board is covered in writing. There are philosophers writing frantically on the chalkboard,\n";
	roomdescription[6] += "scientists nearby conducting experiments, and mathmeticians arguing amongst themselves. \n";
	roomdescription[6] += "great religious leaders from all known religions in all dimensions are crying in the corner. \n";
	roomdescription[6] += "It appears as if they have discovered the mathmatical equation to the universe!\n";
	roomdescription[6] +=	"But its taking quite some time to write it out...\n";
	roomdescription[6] += "They spot you, then an elderly man approaches... He lets you know they created this room to keep themselves safe!\n \n";
	roomdescription[6] += "Because you cannot contribute, and you have never read a philisophical book in your life, they ask you to leave.\n";// think tank
	roomdescription[6] += "Before you go, they give you an ugly stick.\n\n\n";
	roomdescription[6] += "There is a gate to the west\n Where do you go?\n"; //think tank
	roomdescription[7] = "\n\nThere is a giant lake with a rubber duck in the middle.\n\n\n"; //leviathans lair
	roomdescription[7] += "there is a gate to the south\nWhere do you go?\n"; // leviathans lair
	// end list of room descriptions
	
	// multidimensional array thing
	int[][] roomexits = {{  2,  -1,  -1,  -1}, // Room 0
						 {  4,  -1,  -1,  -1}, // Room 1
						 {  5,   3,  -1,   0}, // Room 2
						 { -1,  -1,   2,  -1}, // Room 3
						 { -1,   5,  -1,   1}, // Etc.
						 {  7,   6,   4,   2}, // Room exits Array
						 { -1,  -1,   5,  -1},
						 { -1,  -1,  -1,   5},}; // end room exits array
	//					 	N 	 E    W    S
	
	String scene;
	scene = roomdescription[2];  // description of current room 
	int location;
	location = 2; // variable to represent the current room
	System.out.printf("%s%nPress N to head North%nPress S to head South%nPress E to head East%nPress W to head West%nPress Q to quit%n",scene );
	
		//begin loop of exploration through hell using a while and switch statement!
		while(gameStatus == Status.CONTINUE){
		
			char direction = input.next().charAt(0);//gather player input for direction
			//switch statement which handles players input direction
			switch (direction){
				
				case 'N':
				case 'n':
					location = roomexits[location][0];
					scene = roomdescription[location];
					System.out.printf("%s%n",scene);
					break;
				//player heads north
				case 'E':
				case 'e':
					location = roomexits[location][1];
					scene = roomdescription[location];
					System.out.printf("%s%n",scene);
					break;
				//player heads east
				case 'W':
				case 'w':
					location = roomexits[location][2];
					scene = roomdescription[location];
					System.out.printf("%s%n",scene);
					break;
				//player heads west
				case 'S':
				case 's':
					location = roomexits[location][3];
					scene = roomdescription[location];
					System.out.printf("%s%n",scene);
					break;
				//player heads south
				case 'q':
					System.out.println("You suffer for eternity.");
					gameStatus = Status.LOST;
					break;
				//player quits
				default: 
					System.out.println("\ntry again please\n");
					break;
				//player is dumb
				}// end switch statement!
		};// end while loop!
		
		if (gameStatus == Status.LOST) {
			System.out.println("\n...but mathmatically speaking, you eventually find a way to escape!");
			} //if u lose
	}// end main method
}// end class