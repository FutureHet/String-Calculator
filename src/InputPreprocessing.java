import java.util.*;

public class InputPreprocessing {

   public static String Preprocessing(String inputString) {

      int findStartDel = inputString.indexOf("//");
      int findEndDel = inputString.indexOf("\n");
   
      if(findStartDel != -1) {
         
         String delimeterString = inputString.substring(findStartDel+2, findEndDel);
         inputString = inputString.substring(findEndDel+1);
         Vector<String> delimeters = ExtractDelimiter.extractDelimiters(delimeterString);
   
         for (int i = 0; i < delimeters.size(); i++) {
            inputString = inputString.replace(delimeters.get(i), ",");
         }

      } else {
         inputString = inputString.replace("\n",",");
      }

      return inputString;
   }
}
