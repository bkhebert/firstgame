public class Room {
	// i initiate my instance variables
	private String description;
	private Room roomNorth;
	private Room roomEast;
	private Room roomWest;
	private Room roomSouth;
	
	public Room(String description) {
	// set up a constructor to receive stringed descriptions of a room
		this.description = description;
	// when my constructor is ran, i also set my directions initially to null
		roomNorth = null;
		roomEast  = null;
		roomSouth = null;
		roomWest  = null;
		
	}
	// these following methods are set up to receive the rooms surrounding the player
	public void roomsetNorth(Room r) {
		this.roomNorth = r;
	}
	
	public void roomsetEast(Room r) {
		this.roomEast = r;
	}
	
	public void roomsetWest(Room r) {
		this.roomWest = r;
	}
	
	public void roomsetSouth(Room r) {
		this.roomSouth = r;
	}
	
	//i set up some exits
	public void setExits(Room n, Room e, Room w, Room s) {
		n = roomNorth;
		w = roomWest;
		s = roomSouth;
		e = roomEast;
	}
	public Room getNorth() {
		return roomNorth;
	}
	public Room getEast() {
		return roomEast;
	}
	public Room getWest() {
		return roomWest;
	}
	public Room getSouth() {
		return roomSouth;
	}
	
		
	public String getdescription() {
		return description;
	}
	
	public String getExits() {
	String exitsdescription;
	exitsdescription= "Your exits are: \n ";
		if (roomNorth != null) {
			exitsdescription += " \n North (n)";
		}
		if (roomEast != null) {
			exitsdescription += " \n East (e)";
		}
		if (roomWest != null) {
			exitsdescription += " \n West (w)";
		}
		if (roomSouth != null) {
			exitsdescription += "\n South (s)";
		}
	
	return exitsdescription;
	}
	
	@Override
	public String toString(){ 
		String  wya = "You have entered " + description + getExits();
		return wya;
	}
		
} // end class
	
	