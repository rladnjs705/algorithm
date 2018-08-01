package recursion02;

public class length {
	public static int length(String str) {
		if(str.equals(""))
			return 0;
		else
			return 1+length(str.substring(1));
					
	}
}
