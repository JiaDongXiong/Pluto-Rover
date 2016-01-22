package Rover;

public class Rover {
	
	private int x;
	private int y;
	private String heading;
	
	public Rover(int x, int y, String heading) {
		this.x = x;
		this.y = y;
		this.heading = heading;
	}
	
	public void forward() {
		
		switch (heading) {
			case "N":
				y++;
				break;
			case "E":
				x++;
				break;
			case "S":
				y--;
				break;
			case "W":
				x--;
				break;
			default :
				break;
		}
		
	}
	
	public void backward() {
		
		switch (heading) {
			case "N":
				y--;
				break;
			case "E":
				x--;
				break;
			case "S":
				y++;
				break;
			case "W":
				x++;
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
