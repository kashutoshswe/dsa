package Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length-1;
        return binarySearchHelper(array, target, left, right);
    }

    public static int binarySearchHelper(int[] array, int target, int left, int right)
    {
        int mid = (left + right)/2;
        if(left > right)
            return -1;
        if (array[mid] == target)
            return mid;
        else if(target > array[mid])
            return binarySearchHelper(array, target, mid+1, right);
        else if(target < array[mid])
            return binarySearchHelper(array, target, left, mid-1);
        return mid;
    }
}
