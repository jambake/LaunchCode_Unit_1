package studio4;

import java.awt.Color;
import java.awt.Font;

import sedgewick.StdDraw;

public class Flag {

	
	public static void main(String[] args) {
		// 
		//  Add code for your studio below here.
		//
		
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledRectangle(.5, .5, .5, .3);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.setPenRadius(.05);
		StdDraw.line(0, .8, 1.3, 0);
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledRectangle(.5, .5, .25, .15);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.5, .5, .12);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(.02);
		StdDraw.rectangle(.5, .5, .5, .3);
		
		double x = 0;
		double y = .8;
		
		for (int i = 0; i < 5; i++) {
			x += .168;
			y -= .105;
			Font font = new Font("Calibri", Font.BOLD, 25);
			StdDraw.setFont(font);
			StdDraw.text(x, y, "T.B.A.");
			StdDraw.show(1000);
		}
		
		
	}
}
