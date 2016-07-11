package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(.5, .5);
		// larger green point
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.setPenRadius(.1);
		StdDraw.point(.25, .25);
		// unfilled red triangle
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(.01);
		StdDraw.line(0, 0, 0, .25);
		StdDraw.line(0, .25, .25, 0);
		StdDraw.line(.25, 0, 0, 0);
		// yellow circle, filled
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.75, .75, .25);
		// filled blue rectangle
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.25, .75, .15, .05);

	}

}
