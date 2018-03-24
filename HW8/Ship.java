//***********************************************************
// Name: CSE110 Instructor
// Title: Ship.java
// Author: (if not you, put the name of author here)
// Description: Class definistion for Assignment8
// Time spent:  1 hour
// Date:  Posted on 11/14/2014
//**********************************************************
public class Ship{

	private int xpos, ypos; // position of ship
	private int shipID;         // index of ship
	private String name;    // name of ship
	private boolean isSafe;  // isSafe or not

    // default constructor
	public Ship(){ xpos =0; ypos =0; shipID=0; name=""; isSafe=true; }
    // set all instance variables using the ship information as a string.
	public void setShip(String str){
		String[] items = str.split("[^a-zA-Z0-9]");
		shipID = Integer.parseInt(items[0]);
		xpos = Integer.parseInt(items[1]);
		ypos = Integer.parseInt(items[2]);
		name = items[3];
		if(items[4].equals("true")) isSafe=true;
		else isSafe=false;
	}
	public int getXpos(){return xpos;}  // get the xposition
	public int getYpos(){return ypos;}  // get the yposition
	public int getID(){return shipID;}    //get the shipID
	public String getName() {return name;}  // get the name of ship
	public boolean getSafe() {return isSafe;}  // check whether it is safe or not
	public void setSafe(boolean _safe){isSafe= _safe;} //set the isSafe
	public int getDistance(Ship other){  // calculate the distance to the other ship
			return  (int) (Math.abs (xpos - other.xpos) + Math.abs(ypos-other.ypos));
	}
	// move this ship to up, left, down, and right using 'w', 'a', 'd', and 's' command.
	// It return true if it can move. Otherwise, return false
	public boolean move (char _command){
		switch(_command){
			case 'w':
			    if (ypos  <= 0) return false;
			    ypos--; return true;
			case 'a':
				if (xpos <= 0) return false;
				xpos--; return true;
			case 's':
				if(ypos >=Ocean.gridHeight-1) return false;
				ypos++; return true;
			case 'd':
				if(xpos >=Ocean.gridWidth-1) return false;
				xpos++; return true;
			default: return false;
		}
	}
}