package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);
		int numBall = ap.nextInt("How many bouncing balls?");
		int numTimes = ap.nextInt("How many times to loop?");

		for (int i = 0; i < numTimes; i++) {
			for (int j = 0; j < numBall; j++) {
			
				while (true) {
				StdDraw.clear();
				double x = Math.random();
				double y = Math.random();
				StdDraw.setPenColor(Color.GREEN);	
				StdDraw.filledCircle(x, y, .05);
				StdDraw.show(2000);
				
				}
			}
		}

	}
}	


