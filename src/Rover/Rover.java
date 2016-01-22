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
			default :
				//shouldn't do anything here.
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

	public void backward() {
		switch (heading) {
			case "N":
				x++;
			default :
				//shouldn't do anything here.
	}
		
	}
	
}
