package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls2 {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numBall = ap.nextInt("How many bouncing balls?");
		int numTimes = ap.nextInt("How many times to loop?");
		
		StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

		double[] rxs = new double[numTimes];
		double[] rys = new double[numTimes];
		double[] vxs = new double[numTimes];
		double[] vys = new double[numTimes];

		for (int i = 0; i < numTimes; i++) {
			for (int j = 0; j < numBall; j++) {
				
			rxs[i] = Math.random()*2-0.02; 
			rys[i] = Math.random()*2; 
			vxs[i] = Math.random()*0.01;
			vys[i] = Math.random()*0.01;
			double radius = 0.05;


			while(true) {

				StdDraw.setPenColor(Color.GREEN);
				StdDraw.filledCircle(rxs[i],  rys[i],  radius);
				StdDraw.show(20);
			}
			}
		}
	}
}

