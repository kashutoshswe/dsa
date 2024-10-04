package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public int firstNonRepeatingCharacter(String string) {
       Map<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            Character c = string.charAt(i);
            if(characters.containsKey(c))
                characters.put(c, characters.get(c)+1);
            else
                characters.put(c, 1);
        }
        for(Map.Entry<Character, Integer> eachMap : characters.entrySet())
        {
            int counter = eachMap.getValue();
            if(counter == 1)
            {
                Character c = eachMap.getKey();
                return string.indexOf(c);
            }
        }
        return -1;
    }
}
