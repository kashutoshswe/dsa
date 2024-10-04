package Strings;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {
    public boolean generateDocument(String characters, String document) {
        Map<Character, Integer> charactersSet = new HashMap<>();
        Map<Character, Integer> documentSet = new HashMap<>();

        for (int i = 0; i < characters.length(); i++)
        {
            Character eachCharacter = characters.charAt(i);
            if(charactersSet.containsKey(eachCharacter))
                charactersSet.put(eachCharacter, charactersSet.get(eachCharacter)+1);
            else
                charactersSet.put(eachCharacter, 1);
        }

        for (int i = 0; i < document.length(); i++)
        {
            Character eachCharacter = document.charAt(i);
            if(documentSet.containsKey(eachCharacter))
                documentSet.put(eachCharacter, documentSet.get(eachCharacter)+1);
            else
                documentSet.put(eachCharacter, 1);
        }

        boolean documentGeneration = true;
        for(Map.Entry<Character, Integer> eachMap : documentSet.entrySet())
        {
            Character eachCharacter = eachMap.getKey();
            int countOfEachCharacter = eachMap.getValue();
            if(charactersSet.containsKey(eachCharacter))
            {
                if(charactersSet.get(eachCharacter) < countOfEachCharacter)
                {
                    documentGeneration = false;
                    break;
                }
            }
            else
            {
                documentGeneration = false;
                break;
            }
        }
        return documentGeneration;
    }
}
