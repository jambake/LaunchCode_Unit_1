package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {

	public static void triangle(double llx, double lly, double size) {

		if (size < 0.025) {
			return;
		}
		
		double[] x2 = {llx+(size/4), llx+(size/2), llx+(3*(size/4))};
		double[] y2 = {lly+(size/2), lly, lly+(size/2)};
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledPolygon(x2, y2);
		
		StdDraw.pause(20);
		
		triangle(llx,lly,size/2); // lower left 
		triangle(llx+size/2, lly, size/2); // lower right
		triangle(llx+size/4, lly+size/2, size/2);
		
	}
	public static void main(String[] args) {
		// draw large black triangle first in main method 
		double[] x = {0.0, 0.5, 1.0};
		double[] y = {0.0, 1.0, 0.0};
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledPolygon(x, y);
		// THEN draw recursive white triangles
		triangle(0, 0, 1);


	}
}


