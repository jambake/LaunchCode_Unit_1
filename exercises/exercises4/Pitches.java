package exercises4;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;

public class Pitches {

	public static void main(String[] args) {
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int pitch1 = ap.nextInt("Pitch 1?");
		int pitch2 = ap.nextInt("Pitch 2?");
		double frequency1 = 440.0 * Math.pow(2, pitch1/12.0);
		double frequency2 = 440.0 * Math.pow(2,  pitch2/12.0);
//		System.out.println("For pitch " + pitch1);
//		System.out.println("  we get frequency: " + frequency1);
//		System.out.println("  up a diatonic fifth: " + frequency2);
		double ratio = frequency2 / frequency1;
		System.out.println("  ratio is: " + ratio);

		/*
		double hz = 440.0;
		double seconds = 1.5;
		
		int SAMPLE_RATE = 44100;
		int N = (int) (seconds * SAMPLE_RATE);
		double[] a = new double[N+1];
		for (int i = 0; i <= N; i++) {
			a[i] = Math.sin(2 * Math.PI * i * hz / SAMPLE_RATE);
		}
		StdAudio.play(a);
		*/
	}

}
