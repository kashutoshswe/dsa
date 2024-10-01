package Arrays;

import java.util.Arrays;

public class ThreeLargestNumber {
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] largestNumbers = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < array.length; i++)
            updateLargestNumbers(largestNumbers, array[i]);
        return largestNumbers;
    }

    public static void updateLargestNumbers(int[] largestNumbers, int number) {
        if(largestNumbers[2] == Integer.MIN_VALUE || number > largestNumbers[2])
            shiftAndUpdateLargestNumbers(largestNumbers, number, 2);
        else if(largestNumbers[1] == Integer.MIN_VALUE || number > largestNumbers[1])
            shiftAndUpdateLargestNumbers(largestNumbers, number, 1);
        else if(largestNumbers[0] == Integer.MIN_VALUE || number > largestNumbers[0])
            shiftAndUpdateLargestNumbers(largestNumbers, number, 0);
    }

    public static void shiftAndUpdateLargestNumbers(int[] largestNumbers, int number, int index)
    {
        for(int i = 0; i < index+1; i++)
        {
            if(i == index)
                largestNumbers[i] = number;
            else
                largestNumbers[i] = largestNumbers[i+1];
        }
    }
}
