package lab3;

import cse131.ArgsProcessor;

public class Dice2 {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);
		// Determine how many dice how many times
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
		System.out.println();
		// Dice rolls
		double v = 0;
		int diceNum;
		int count = 0;
		int sum = 0;

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
			
			// Sum of each dice roll
			for (int m = 0; m < D; m++) {
				sum = diceThrown[m] + sum; 
			} 
			System.out.println("Dice added together = " + sum);
			sum = 0;	
			
			// How many times the dice match per each roll
			for (int n = 0; n < D; n++) {
				if (diceThrown[0] == diceThrown[n]) {
				} else {
					count++;
				}
			}
		}
		System.out.println();
		if (T-count > 0) {
			System.out.println(T-count + " out of " + T + " times the dice matched, which is " + ((double)(T-count)/T)*100 + "% of the time.");
		} else {
			System.out.println("All dice thrown in one iteration never matched.");
		}
	}
}



