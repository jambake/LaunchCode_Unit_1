package exercises5;

public class StringMethods {
	
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//
	
	//
	// First one is completed for you:
	//
	
	public static String selfConcat(String s) {
		return s + s;
		//return copies("hello", 2);
	}
	
	public static String copies(String s, int n) {
		/*String ans = "";
		for (int i = 0; i < n; i++) {
			ans = ans + s;
		}
		return ans;*/
		String[] array = new String[n];
		for (int i=0; i < n; i++){
			array[i] = s;
		}
		return join(array, "");
	}
	
	public static String join(String[] array, String joiner) {
		if (array.length == 0) {
			return "";
		}
		String ans = array[0];
		for(int i = 1; i < array.length; i++){
			ans = ans + joiner + array[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		//
		// Testing the methods
		//
		System.out.println(selfConcat("echo"));
		for (int i = 0; i<5; i++) {
		System.out.println(copies("hello ", i));
		}
		
		String s = "I like computer science!";
		String[] words = s.split(" ");
		for (String w : words) {
			// for (int i = 0; i < words.length; i++) {
			//	System.out.println("A word: " + words[i]);
			System.out.println("A word: " + w);
		}
		System.out.println("Back together: " + join(words, " "));
				
	}
}
