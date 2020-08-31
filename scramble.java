import java.util.*;
public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
      //Check if either string is empty, or if they are equal
      if (str1.isEmpty() || str2.isEmpty() ) { 
        return false;
      }
      if (str1.equals(str2)) {
        return true;
      }
      //converts to lower case for comparison
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
      //make lists of characters of both strings
      List<Character> a = new ArrayList<>();
      for (char temp : str1.toCharArray()){
        a.add(temp);
      }
      List<Character> b = new ArrayList<>();
      for (char temp : str2.toCharArray()) {
        b.add(temp);
      }
      //check if each character in the second string is in the first string
      //if it is, then it removes that char from the first string
      //this allows for duplicate character detection
      for (char bTemp : b) {
        if(!a.contains(bTemp)) {
          return false;
        } else {
          a.remove(a.indexOf(bTemp));
        } 
      }
      return true;
    }
}
