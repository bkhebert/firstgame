public class Dungeon {
    
	private Room pit = new Room(" the pit; It is very dark and bones lie beneath you \n");
	private Room restroom = new Room(" a restroom;... what is that doing in here? \n");
	private Room lab = new Room("a strange laboratory; someone has been researching something! \n");
	private Room ball = new Room("a ballroom; it is dark, but it looks as if the shadows are dancing on the walls! \n");
	private Room satan = new Room("there is a satanic lair here... spooky! \n");
	private Room outside = new Room("you made it outside! time to get out of here! \n");
	private Room stairs = new Room ("there are ominous stairs that lead down... forever \n");
	private Room office = new Room ("an office... its ominous and seems to be different");
	// initialized rooms with descriptions above
	// setting up exits for rooms below
	private Room current = pit;
	//setting up constructor which contains exits
	public Dungeon(int x) {
		
		pit.roomsetNorth(ball);
		pit.roomsetSouth(restroom);
		pit.roomsetEast(lab);
		pit.roomsetWest(office);
		office.roomsetEast(pit);
		restroom.roomsetNorth(pit);
		lab.roomsetWest(pit);
		lab.roomsetSouth(stairs);
		ball.roomsetNorth(outside);
		stairs.roomsetNorth(lab);
		satan.roomsetEast(ball);
		outside.roomsetSouth(ball);
		ball.roomsetSouth(pit);
		// i used an If statement to catch the number (which is set within a 2d Array containing the rooms) 
		if ( x == 0 ) {
			this.current = pit;
		}
		if ( x == 1 ) {
			this.current = restroom;
		}
		if ( x == 2 ) {
			this.current = lab;
		}
		if ( x == 3 ) {
			this.current = ball;
		}
		if ( x == 4 ) {
			this.current = stairs;
		}
		if ( x == 5 ) {
			this.current = satan;
		}
		if ( x == 6 ) {
			this.current = outside;
		}
		if ( x == 7 ) {
			this.current = office;
		}
	}
	// this returns the rooms description
	public String getRoom(){
		Room status = this.current;
	return status.toString(); 
}
} 