package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
				
				ArgsProcessor ap = new ArgsProcessor(args);
				// Variables
				int D = ap.nextInt("How many dice would you like to throw?");
				int T = ap.nextInt("How many times would you like to throw " + D + " dice?");
				double v = 0;
				int N = 0;
				
				// Chosen by user
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
				// Dice roles
				int [] diceThrown = new int[D];
				for (int i = 0; i < T; i++) {
					for (int j = 0; j < D; j++) {

						v = Math.random();
						if (v < 1.0/6.0){
							System.out.print("1 (" +diceThrown[i]+ ") ");
							diceThrown[i] = 1;
							N = diceThrown[i];
						} 
						else if (v < 2.0/6.0){
							System.out.print("2 (" +diceThrown[i]+ ") ");
							diceThrown[i] = 2;
							N = diceThrown[i];
						}
						else if (v < 3.0/6.0){
							System.out.print("3 (" +diceThrown[i]+ ") ");
							diceThrown[i] = 3;
							N = diceThrown[i];
						}
						else if (v < 4.0/6.0){
							System.out.print("4 (" +diceThrown[i]+ ") ");
							diceThrown[i] = 4;
							N = diceThrown[i];
						}
						else if (v < 5.0/6.0){
							System.out.print("5 (" +diceThrown[i]+ ") ");
							diceThrown[i] = 5;
							N = diceThrown[i];
						}
						else {
							System.out.print("6 (" +diceThrown[i]+ ") ");
							diceThrown[i] = 6;
							N = diceThrown[i];
						}
					}
					System.out.println();
				}

				
				/*int [][] table = new int[D][T];
				for (int r = 1; r < D; r++) {
					for (int c = 1; c < T; c++) {
						table[r][c] = N;
					}
				}
				*/

				
				
				System.out.print("     ");
				for (int c = 1; c <= T; c++) {
					System.out.print(c + "  ");
				}
				System.out.println();
				for (int c = 1; c <= T+1; c++) {
					System.out.print("---");
				}
				System.out.println();
				for (int r = 1; r <= D; r++) {
					System.out.print(r + " | ");
					for (int c = 1; c <= T; c++) {
						System.out.print(" " + N + " ");
						/*int entry = table[r][c];
						if (entry < 10) {
							System.out.print(" " + table[r][c] + " ");
						} else {
						System.out.print(table[r][c] + " ");
						*/
					}
					System.out.println();
				}
			}
	
	}

		
	
