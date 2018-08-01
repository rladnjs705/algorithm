package recursion02;

public class printChars {
	public static void printChars(String str) {
		if(str.length()==0)
			return;
		else {
			System.out.print(str.charAt(0));
			printChars(str.substring(1));
		}
	}
}
