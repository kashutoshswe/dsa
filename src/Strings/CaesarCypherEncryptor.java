package Strings;

import java.util.Arrays;

public class CaesarCypherEncryptor {
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char[] eachChracterArray = str.toCharArray();
        int[] asciiKeyValues = new int[eachChracterArray.length];
        for (int i = 0; i < eachChracterArray.length; i++) {
            asciiKeyValues[i] = (int) eachChracterArray[i] + key;
            while(asciiKeyValues[i] > 122)
                asciiKeyValues[i] -=26;
            eachChracterArray[i] = (char) asciiKeyValues[i];
        }
        return new String(eachChracterArray);
    }
}

