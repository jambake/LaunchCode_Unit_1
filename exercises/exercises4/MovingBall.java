package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class MovingBall {

	public static void main(String[] args) {
		// ball to move across screen
		// when it reaches right side
		//	start over at left side
		
		// need something to represent current x location
		// of the ball
		
		double ballX = 0; 
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.setPenRadius(.05);
		
		while (true) {
			// clear the canvas
			StdDraw.clear();
			ballX = ballX + .005;
			if (ballX > 1.0) { // moved too far right
				ballX = 0;	   // start over at left
			}
			StdDraw.point(ballX, 0.5);
			StdDraw.show(10);
		}
	}

}
