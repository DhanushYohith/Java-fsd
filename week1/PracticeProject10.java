package assistedPractice.week1;

// Program to verify implementations of regular expressions

import java.util.regex.* ; 

/*
 Regex:  a sequence of characters that specifies a match pattern in text.Usually used by string searching algorithms for
 find and replace operations .
 */
public class PracticeProject10 {
	
	public static void main(String[] args) {
		String x = "\\d+" ;
		
		String[] inputs = {"12345" , "abc123" , "456xyz" , "789" , "def"};
		
		Pattern regex = Pattern.compile(x);
		
		for(String input : inputs) {
			Matcher matcher = regex.matcher(input) ;
			if(matcher.matches())
				System.out.println("'" + input + "' matches the pattern.");
			else
				System.out.println("'" + input + "' does not match the pattern.");
		}				
	}
}
