package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class Sine {

	public static void main(String[] args) {
		// Math.sin() = computes sin for provided value 
		// length of a sine wave is 2pi - adjust canvas size
		// x: 0 -> 2 * pi
		// y: -1 -> 1
		
		// for x from 0 to 2 * pi with 1000 points
			// y = Math.sin(x)
			// draw a point at (x, y)
		
		StdDraw.setXscale(0, (2 * Math.PI));
        StdDraw.setYscale(-1.0, 1.0);
        
        //double x = 0;
        //double y = 0;
        int numPoints = 1000;
        double move = 2 * Math.PI / numPoints;
        double[] points = new double[numPoints];
        
        for (int i = 0; i < numPoints; i++) {
        	//y = Math.sin(x);
        // put into an array
        	//double y = Math.sin(move * i);
        	points[i] = Math.sin(move * i);
        	//x += (2 * Math.PI) / 1000;
        	//StdDraw.point(x, y);
        	//StdDraw.point(move * i,  y);       	 	
        }
        // make animation loop below
        
        // start at array[0]
        int start = 0;
        
        while (true) {
        	StdDraw.clear();
        	
        	//draw stuff
        	//for each point (1000)
        		// get the y value out of the array
        		// plot it
        		// if at end of array
        			//go back to beginning
        	
        	for (int i = 0; i < numPoints; i++) {
        		StdDraw.setPenRadius(.01);
        		StdDraw.setPenColor(Color.GREEN);
        		StdDraw.point(move * i, points[start]);
        		start++;
        		if (start > numPoints - 1) {
        			start = 0;
        		}
        	}
        	// update start position
    		start++;
    		if (start > numPoints - 1) {
    			start = 0;
    		}
        	StdDraw.show(1);
        }
	}
}
