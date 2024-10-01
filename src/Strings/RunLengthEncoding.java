package Strings;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RunLengthEncoding {
    public String runLengthEncoding(String string) {
        //declare an arraylist to store all the elements which will be encoded
        ArrayList<Character> chars = new ArrayList<>();

        //current length to be set to 1
        int currentRunLength = 1;

        //we will compare the current character with previous character starting from 1
        for (int i = 1; i < string.length(); i++) {
            char currentCharacter = string.charAt(i);
            char previousCharacter = string.charAt(i-1);

            // once the current character mismatches, or counter becomes 9, then we have to add that previous character
            // to the chars list and then set current set length to zero because anyways it will be incremented
            if((currentCharacter != previousCharacter) || (currentRunLength == 9)) {
                chars.add((char) (currentRunLength + '0'));
                chars.add(previousCharacter);
                currentRunLength = 0;
            }
            currentRunLength +=1;
        }

        // once we are done with the original string, we have been left with the last character and it's count to be added
        // why? because we are comparing to the last character, therefore this last character will be not having any comparsion
        // so we need to add the last character and it's own count
        chars.add((char) (currentRunLength + '0'));
        chars.add(string.charAt(string.length()-1));

        //once that is done, then we convert the character array to a string and return
        return chars.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
