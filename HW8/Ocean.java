//*********************************************************** 
// Name: Michael Baldwin
// Title: Ocean.java
// Description: This will create the ocean for the ship game 
// Time spent: 2.5 hours
// Date: 11/30/2014
//**********************************************************

public class Ocean {

	private int[][] grids;
	private Ship[] ships;
	public static int gridWidth;
	public static int gridHeight;
	
	public Ocean (int width, int height, int shipNum) {
		grids = new int[height][width];
		ships = new Ship[shipNum];
		for (int i=0; i<shipNum; i++)
			ships[i] = new Ship();
		gridHeight = height;
		gridWidth = width;
	}
	
	public void setShips(String[] data) {
		String ship;
		for (int i=0; i<data.length; i++) {
			ship = data[i];
			ships[i].setShip(ship);
		}
	}
	
	public boolean isSafe() {
		boolean answer = true;
		for (int i=0; i<ships.length; i++) 
			if (!(ships[i].getSafe()))
				answer = false;
		return answer;
	}
	
	private Ship getShip(int shipID) {
		int key = 0;
		for (int i=0; i<ships.length; i++) 
			if (ships[i].getID() == shipID)
				key = i;
		return ships[key];
	}
	
	public void message(int shipID, char command) {
		if (getShip(shipID).move(command))
			System.out.println("d [" + getShip(shipID).getName() + 
				" moved to (" + getShip(shipID).getXpos() + ", " + 
				getShip(shipID).getYpos() + ")]");
		else if (!(getShip(shipID).move(command)))
			System.out.println("The ship cannot move to the direction.");
	}
	
	public void updateSafe() {
		for (int i=0; i<ships.length; i++) //current ship
			if (!(ships[i].getSafe())) // is current not safe?
				for (int j=0; j<ships.length; j++) //second ship
					if (j != i) //don't check the current ship
						if (ships[j].getSafe()) //is second safe?
							if (ships[i].getDistance(ships[j]) == 1) {
								ships[i].setSafe(true);
								System.out.println("The " + ships[i].getName() 
									+ " is saved.");
							} //if current ship is next to safe ship
							// then current ship is saved
	}
	
	public void printInfo() {
		for (int r=0; r<gridHeight; r++)
			for (int c=0; c<gridWidth; c++)
				grids[r][c] = 0;

		for (int r=0; r<gridHeight; r++)
			for (int c=0; c<gridWidth; c++)
				for (int i=0; i<ships.length; i++)
					if (ships[i].getYpos() == r && ships[i].getXpos() == c) {
						if (!(ships[i].getSafe()))
							grids[r][c] = -1;
						else
							grids[r][c] = ships[i].getID();
					}

		for (int r=0; r<gridHeight; r++) {
			System.out.println();
			for (int c=0; c<gridWidth; c++) {
				if (grids[r][c] == -1)
					System.out.print("X ");
				else if (grids[r][c] == 0)
					System.out.print("* ");
				else
					System.out.print(grids[r][c] + " ");
			}
		}
	}
}