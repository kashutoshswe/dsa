package Arrays;

import java.util.*;

class ValidSubsequence {
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        int arrayPointer = 0;
        int sequencePointer = 0;
        while (arrayPointer < array.size() && sequencePointer < sequence.size()) {
            if(array.get(arrayPointer) == sequence.get(sequencePointer))
                sequencePointer++;
            arrayPointer++;
        }
        return sequencePointer == sequence.size();
    }
}
