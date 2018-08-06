package recursion01_1;

public class printCharsResverse {
	
	public static void printCharsResverse(String str) {
		
	if(str.length()==0)
		return;
	else {
		printCharsResverse(str.substring(1));
		System.out.print(str.charAt(0));
	}
	}
}
