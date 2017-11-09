import java.util.Scanner; 
public class Pitgame {
	
	static enum Status {CONTINUE, WON, LOST};
	static Status gameStatus;
	
	public static void main(String[] args){
		// i began by initiating a few variables here and some objects
	gameStatus = Status.CONTINUE;
	
	 Scanner input = new Scanner(System.in);
	int currentloc;
	currentloc = 0;
	Dungeon location = new Dungeon(0); 
	// an array of rooms with exits for navigational purposes
	int[][] roomexits =    {{  3,  2, -1,  1}, // room 0
							{  0, -1, -1, -1}, 
							{ -1, -1,  0,  4}, // room 2
							{ 6,  -1,  5,  0},
							{  2, -1, -1, -1}, // room 4
							{ -1,  3, -1, -1},
							{ -1, -1, -1,  3}}; // room 6
	// i welcome the player to the game
	System.out.println("Welcome player! \n You have awaken in a pit! \n");
	
	// i begin a loop that lasts until the game is terminated
	
	while(gameStatus == Status.CONTINUE){
		//here i use an If statement that keeps our player "trapped" in the game muahaha
	if ((currentloc < 0)||(currentloc > 6)) {
		
		System.out.println("\n You begin start to fade all of a sudden");
		currentloc = 1;
		System.out.println("\n You have reawaken in the pit! It is unescapable!");
		}
		// here i set it up so each selection my player makes, will update thier rooms
		
	location = new Dungeon(currentloc);
	System.out.print("" + location.getRoom());
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
		case 'q':
		case 'Q':
			System.out.println("You suddenly awake in your bed from a bad dream!");
			gameStatus = Status.LOST;
	} // end switch	
	} // end game loop
	} // end main
} // end class