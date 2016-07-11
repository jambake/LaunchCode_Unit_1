package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How much history?");
		//(1)double ballX = 0.0;

		//(2)StdDraw.setPenColor(Color.BLUE);
		//(2)StdDraw.setPenRadius(.05);
		double[] histX = new double[N];
		double[] histY = new double[N];
		
		int current = 0;
		
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			
			histX[current] = x;
			histY[current] = y;
			current += 1;
			if (current >= histX.length) {
				current = 0;
			}
			int oldest = current;
			
			StdDraw.setPenColor(Color.BLUE);
			StdDraw.filledCircle(histX[oldest],  histY[oldest], .05);
			//(2) StdDraw.point(x,  y);
			
			/*(1)ballX = ballX + .005;
			if (ballX > 1.0) {
				ballX = 0;
			}
			StdDraw.point(ballX, .5);
			StdDraw.show(10);*/
			
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(10);
		}

	}

}
