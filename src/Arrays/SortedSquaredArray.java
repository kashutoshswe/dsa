package Arrays;

import java.util.*;

class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i]*array[i];
        }
        Arrays.sort(array);
        return array;
    }

    // Another approach using two pointers and absolute function
    public int[] sortedSquaredArrayTwo(int[] array) {
        int smallIdx = 0;
        int largeIdx = array.length-1;
        int[] resultArray = new int[array.length];
        int resultArrayIndex = largeIdx;
        while (smallIdx<=largeIdx) {
            if(Math.abs(array[smallIdx]) > Math.abs(array[largeIdx]))
            {
                resultArray[resultArrayIndex] = array[smallIdx] * array[smallIdx];
                smallIdx+=1;
            }
            else
            {
                resultArray[resultArrayIndex] = array[largeIdx] * array[largeIdx];
                largeIdx-=1;
            }
            resultArrayIndex--;
        }
        return resultArray;
    }
}
