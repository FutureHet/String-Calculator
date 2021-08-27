import java.util.*;

public class ExtractDelimiter {
	
	public static Vector<String> extractDelimiters(String delimeterString) {
   
		Vector<String> delimeters = new Vector<String>();

		if(delimeterString.charAt(0) == '[') {
					
			int findEndDelString = delimeterString.indexOf(']');
			String startingDel = delimeterString.substring(1, findEndDelString);
			delimeters.add(startingDel);
	     	delimeterString = delimeterString.substring(findEndDelString+1);

		} else {
			delimeters.add(delimeterString);
		}
	  return delimeters;
   }
}