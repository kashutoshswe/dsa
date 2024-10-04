package Strings;

import java.util.*;

public class Semordnilap {
    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        ArrayList<ArrayList<String>> outputArrayList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        Collections.addAll(stringSet, words);
        for (String word : words)
        {
            String pallidromeOfTheWord = pallindrome(word);
            stringSet.remove(word);
            if (stringSet.contains(pallidromeOfTheWord))
            {
                ArrayList<String> combinedPair = new ArrayList<>();
                combinedPair.add(word);
                combinedPair.add(pallidromeOfTheWord);
                stringSet.remove(pallidromeOfTheWord);
                outputArrayList.add(combinedPair);
            }
        }
        return outputArrayList;
    }

    public static String pallindrome(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = word.length()-1; i > -1 ; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
