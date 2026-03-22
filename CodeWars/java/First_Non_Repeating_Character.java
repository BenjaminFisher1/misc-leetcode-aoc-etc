import java.util.LinkedHashMap;
import java.util.Map;

public class Kata {
  public static String firstNonRepeatingLetter(String s) {
    String str = s.toLowerCase();
    
    // Count frequencies using a map that preserves order
    Map<Integer, Integer> freq = new LinkedHashMap<>();
    str.codePoints().forEach(cp -> freq.put(cp, freq.getOrDefault(cp, 0) + 1));
    
    // Find first character with frequency 1
    return s.codePoints()
      .filter(cp -> freq.get(Character.toLowerCase(cp)) == 1)
      .mapToObj(Character::toString)
      .findFirst()
      .orElse("");
  }
}
