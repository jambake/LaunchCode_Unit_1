package exercises4;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while (!StdDraw.mousePressed()){
			StdDraw.pause(100);
		}
		//System.out.println("Pressed");
		// here, the mouse has been pressed
		while (StdDraw.mousePressed()){
			StdDraw.pause(100);
		}
		//System.out.println("Released");
		// here the mouse is released
		StdDraw.setPenRadius(.05);
		StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());
		
		// draw a point at the location of the mouse
		char gotQ = ' ';
		while (gotQ != 'q'){
			while (!StdDraw.hasNextKeyTyped()){
				StdDraw.pause(100);
			}
			gotQ = StdDraw.nextKeyTyped();
		}
			StdDraw.text(.5, .5, "Good Bye");
	
		
		// here, a q has been typed
		
		
		//StdDraw.text(0.5, 0.5, "Farewell!");

	}

}
