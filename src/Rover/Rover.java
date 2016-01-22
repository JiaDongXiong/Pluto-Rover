package Rover;

public class Rover {
	
	private int x;
	private int y;
	private String heading;

	//Let the grid be 100x100
	private int maxBound = 100;
	private int minBound = 0;
	
	private Boolean awaiting = false;
	
	public Rover(int x, int y, String heading) {
		this.x = x;
		this.y = y;
		this.heading = heading;
	}
	
	private boolean detectObstacle(int newX, int newY) {
		if(newX == 98 && newY == 1) {
			awaiting = true;
			return true;
		}
		return false;
	}
	
	public String forward() {
		
		if (awaiting) return null;
		
		int tempX = x;
		int tempY = y;
		
		switch (heading) {
			case "N":
				if (y == maxBound) {
					y = 0;
				} else{
					y++;
				}
				break;
			case "E":
				if (x == maxBound) {
					x = 0;
				} else{
					x++;
				}
				break;
			case "S":
				if (y == minBound) {
					y = 100;
				} else{
					y--;
				}
				break;
			case "W":
				if (x == minBound) {
					x = 100;
				} else {
					x--;
				}
				break;
			default :
				break;
		}
		
		if (detectObstacle(x, y)) {
			String report = "Obstacle detected at (" + x + ", " + y + ").";
			x = tempX;
			y = tempY;
			return report;
		}
		
		return null;
	}
	
	public String backward() {
		
		if (awaiting) return null;
		
		int tempX = x;
		int tempY = y;
		
		switch (heading) {
			case "N":
				if (y == minBound) {
					y = 100;
				} else{
					y--;
				}
				break;
			case "E":
				if (x == minBound) {
					x = 100;
				} else {
					x--;
				}
				break;
			case "S":
				if (y == maxBound) {
					y = 0;
				} else{
					y++;
				}
				break;
			case "W":
				if (x == maxBound) {
					x = 0;
				} else{
					x++;
				}
				break;
			default :
				break;
		}
		
		if (detectObstacle(x, y)) {
			String report = "Obstacle detected at (" + x + ", " + y + ").";
			x = tempX;
			y = tempY;
			return report;
		}
		
		return null;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getHeading() {
		return heading;
	}

	public void turnLeft() {
		
		if (awaiting) return;
		
		switch (heading) {
			case "N":
				heading = "W";
				break;
			case "E":
				heading = "N";
				break;
			case "S":
				heading = "E";
				break;
			case "W":
				heading = "S";
				break;
			default :
				break;
		}
		
	}

	public void turnRight() {
		
		if (awaiting) return;
		
		switch (heading) {
			case "N":
				heading = "E";
				break;
			case "E":
				heading = "S";
				break;
			case "S":
				heading = "W";
				break;
			case "W":
				heading = "N";
				break;
			default :
				break;
		}
		
	}
	
}
