package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numBall = ap.nextInt("How many bouncing balls?");
		//double[] Ball = new double [numBall];

		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);

		for (int i = 0; i < numBall; i++) {
			
			double rx = Math.random(), ry = Math.random();     // position
			double vx = Math.random(), vy = Math.random();     // velocity
			double radius = 0.05;
			
				while (true)  { 

					if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
					if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

					rx = rx + vx; 
					ry = ry + vy; 

					StdDraw.setPenColor(StdDraw.GRAY);
					StdDraw.filledSquare(0, 0, 1.0);

					// draw ball on the screen
					StdDraw.setPenColor(StdDraw.GREEN); 
					StdDraw.filledCircle(rx, ry, radius);


					StdDraw.show(100);
				}	
			}
		}
	}	


