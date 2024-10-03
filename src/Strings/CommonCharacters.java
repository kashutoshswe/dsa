package Strings;

import java.util.*;

public class CommonCharacters {
    public String[] commonCharacters(String[] strings) {
        //declare a map to keep track characters and their occurrence count
        Map<Character, Integer> characterCount = new HashMap<>();

        //fetch each string in the array
        for (String string : strings)
        {
            //convert each string into the corresponding character set to remove duplicates
            Set<Character> charactersSet = new HashSet<>();
            for (int j = 0; j < string.length(); j++)
                charactersSet.add(string.charAt(j));

            //then check the character count map and increment counter
            for (Character c : charactersSet)
            {
                if (characterCount.containsKey(c))
                {
                    int count = characterCount.get(c);
                    count = count + 1;
                    characterCount.put(c, count);
                }
                else
                    characterCount.put(c, 1);
            }
        }

        //finally add only those characters to the array which are having length equal to the array length
        ArrayList<String> commonCharacters = new ArrayList<>();
        for(Map.Entry<Character, Integer> c : characterCount.entrySet()) {
            if(c.getValue() == strings.length)
                commonCharacters.add(String.valueOf(c.getKey()));
        }
        return commonCharacters.toArray(new String[0]);
    }
}
