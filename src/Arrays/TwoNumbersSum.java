package Arrays;

import java.util.*;

class TwoNumbersSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {

        int left = 0;
        int right = array.length;
        Arrays.sort(array);
        for(int i=left;i<right;i++) {
            if(array[left] + array[right] == targetSum)
                return new int[]{array[left], array[right]};
            else if (array[left] + array[right] < targetSum)
                left +=1;
            else
                right -=1;
        }
        return new int[0];
    }
}
