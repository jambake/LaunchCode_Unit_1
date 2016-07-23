package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls2 {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numBall = ap.nextInt("How many bouncing balls?");
		int numTimes = 100000; //ap.nextInt("How many times to loop?");

		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);

		double[] rxs = new double[numTimes];
		double[] rys = new double[numTimes];
		double[] vxs = new double[numTimes];
		double[] vys = new double[numTimes];

		//establish initial ball location/velocity
		for (int k = 0; k < numBall; k++) {

			rxs[k] = Math.random()*2-1; 
			rys[k] = Math.random()*2-1; 
			vxs[k] = Math.random()/20;
			vys[k] = Math.random()/20;

		}

		//initiate number of iterations
		for (int i = 0; i < numTimes; i++) {

			StdDraw.clear();

			for (int j = 0; j < numBall; j++) {

				//draw balls
				double radius = 0.1;
				StdDraw.setPenColor(Color.BLUE);
				StdDraw.filledCircle(rxs[j],  rys[j],  radius);

				//balls bounce off walls
				if (Math.abs(rxs[j] + vxs[j]) > 1.0 - radius) {
					vxs[j] = -vxs[j];
				}
				if (Math.abs(rys[j] + vys[j]) > 1.0 - radius) {
					vys[j] = -vys[j];
				}

				// loop for balls bouncing off each other 
				// pythagoreon theory?
				for (int m = j + 1; m < numBall; m++) {
					//if (Math.sqrt(Math.pow(rxs[m]-rxs[j], 2) + Math.pow(rys[m]-rys[j], 2)) <= radius + radius) { 
					if ( (Math.abs(rxs[j] - rxs[m]) < (radius + radius)) && (Math.abs(rys[j] - rys[m]) < (radius + radius)) ) {

						vxs[j] = -vxs[j]; 
						vys[j] = -vys[j];
						vxs[m] = -vxs[m];
						vys[m] = -vys[m];
						
					}
				}

				//update balls position
				rxs[j] = rxs[j] + vxs[j]; 
				rys[j] = rys[j] + vys[j];


			}	
			StdDraw.show(30);
		}
	}
}


