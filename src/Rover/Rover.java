package Rover;

public class Rover {
	
	private int x;
	private int y;
	private String heading;
	
	private int maxBound = 100;
	private int minBound = 0;
	
	public Rover(int x, int y, String heading) {
		this.x = x;
		this.y = y;
		this.heading = heading;
	}
	
	public void forward() {
		
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
		
	}
	
	public void backward() {
		
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
