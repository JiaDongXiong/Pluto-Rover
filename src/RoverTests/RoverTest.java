package RoverTests;

import static org.junit.Assert.*;

import org.junit.Test;
import Rover.Rover;

public class RoverTest {
	
	Rover rover = new Rover(0,0,"N");
	
	//Forward command should only move the rover in its current direction by one grid unit
	@Test
	public final void FCommandWillMoveRoverForwardByOneGridUnit() {
		rover.forward();
		assertEquals(1, rover.getY()); //The default heading is north, so we would expect y+1.
	}
	
	@Test
	public final void FCommandShouldNotChangeTheHeadingOfTheRover() {
		rover.forward();
		assertEquals("N", rover.getHeading());
	}
	
	@Test
	public final void BCommandWillMoveRoverBackwardByOneGridUnit() {
		rover.backward();
		assertEquals(1, rover.getX()); //The default heading is north, so we would expect y+1.
	}
	
	@Test
	public final void BCommandShouldNotChangeTheHeadingOfTheRover() {
		rover.backward();
		assertEquals("N", rover.getHeading());
	}
	
}
