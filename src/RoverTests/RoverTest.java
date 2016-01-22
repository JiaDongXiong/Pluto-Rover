package RoverTests;

import static org.junit.Assert.*;

import org.junit.Test;
import Rover.Rover;

public class RoverTest {
	
	Rover rover = new Rover(0,0,"N");
	
	//Forward command should only move the rover in its current direction by one grid unit
//	@Test
//	public final void FCommandWillMoveRoverForwardByOneGridUnit() {
//		rover.forward();
//		assertEquals(1, rover.getY()); 		//The default heading is north, so we would expect y+1.
//	}
//	
//	@Test
//	public final void BCommandWillMoveRoverBackwardByOneGridUnit() {
//		rover.backward();
//		assertEquals(100, rover.getY()); 		//The default heading is north, so we would expect y-1.
//	}
	
	@Test
	public final void FCommandShouldNotChangeTheHeadingOfTheRover() {
		rover.forward();
		assertEquals("N", rover.getHeading());
	}
	
	@Test
	public final void BCommandShouldNotChangeTheHeadingOfTheRover() {
		rover.backward();
		assertEquals("N", rover.getHeading());
	}
	
	@Test
	public final void LCommandShouldNotChangeThePositionOfTheRover() {
		rover.turnLeft();
		assertEquals(0, rover.getX());
		assertEquals(0, rover.getY());
	}
	
	@Test
	public final void RCommandShouldNotChangeThePositionOfTheRover() {
		rover.turnRight();
		assertEquals(0, rover.getX());
		assertEquals(0, rover.getY());
	}
	
//	@Test
//	public final void LCommandShouldChangeTheHeadingOfTheRover() {
//		rover.turnLeft();
//		assertEquals("W", rover.getHeading()); 		//The default heading is north, 
//											   		//so we would expect the rover facing west now.
//	}
//	
//	@Test
//	public final void RCommandShouldChangeTheHeadingOfTheRover() {
//		rover.turnRight();
//		assertEquals("E", rover.getHeading());  	//The default heading is north, 
//		   											//so we would expect the rover facing east now.
//	}
	
//	@Test
//	public final void RoverShouldBeAbleToHandleASequenceOfCommands() {
//		rover.turnLeft();
//		rover.forward();
//		rover.turnLeft();
//		rover.backward();
//		rover.turnRight();
//		rover.forward();
//		rover.turnLeft();
//		rover.backward();
//		
//		assertEquals("S", rover.getHeading());
//		assertEquals(-2, rover.getX());
//		assertEquals(2, rover.getY());
//	}
	
	@Test
	public final void RoverCanMoveFromOneEdgeToTheOther() {
		rover.turnLeft(); 	//now the rover is facing west
		rover.forward();	//make the rover to cross the bound
		assertEquals(100, rover.getX()); 	//Rover should be at (100, 0) now.
		assertEquals(0, rover.getY());
		
		rover.turnRight(); 	//now the rover is facing north
		rover.backward();
		assertEquals(100, rover.getX()); 	//Rover should be at (100, 100) now.
		assertEquals(100, rover.getY());
	}
	
}
