package lab3;

import cse131.ArgsProcessor;

public class Dice2 {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int D = ap.nextInt("How many dice would you like to throw?");
	int T = ap.nextInt("How many times would you like to throw " + D + " dice?");
	
	
	if (D == 1 && T == 1) {
		System.out.println("You chose to throw " + D + " die " + T + " time.");
	}
	else if (D > 1 && T == 1){
		System.out.println("You chose to throw " + D + " dice " + T + " time.");
	}
	else if (D == 1 && T > 1){
		System.out.println("You chose to throw " + D + " die " + T + " times.");
	}
	else {
		System.out.println("You chose to throw " + D + " dice " + T + " times.");
	}
	
	double v = 0;
	int diceNum;
	int[] diceThrown = new int[D];
	for (int j = 0; j < T; j++) {
		for (int i = 0; i < D; i++) {
			v = Math.random();
			if (v < 1.0/6.0){
				diceNum = 1;
				diceThrown[i] = diceNum;
				//System.out.print(diceNum + " ");
			} 
			else if (v < 2.0/6.0){
				diceNum = 2;
				diceThrown[i] = diceNum;
				//System.out.print(diceNum + " ");
			}
			else if (v < 3.0/6.0){
				diceNum = 3;
				diceThrown[i] = diceNum;
				//System.out.print(diceNum + " ");
			}
			else if (v < 4.0/6.0){
				diceNum = 4;
				diceThrown[i] = diceNum;
				//System.out.print(diceNum + " ");
			}
			else if (v < 5.0/6.0){
				diceNum = 5;
				diceThrown[i] = diceNum;
				//System.out.print(diceNum + " ");
			}
			else {
				diceNum = 6;
				diceThrown[i] = diceNum;
				//System.out.print(diceNum + " ");
			}
			System.out.print(diceThrown[i] + "|");
			}
		System.out.println();
		}
	
	}
}
