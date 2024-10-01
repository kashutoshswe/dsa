package Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
       int currentIndex = 0;
       int smallestIndex;
       // last element will be automatically sorted once the remaining elements are sorted
       while(currentIndex < array.length-1)
       {
           smallestIndex =  currentIndex;
           for (int i = currentIndex+1; i < array.length; i++) {
               if(array[i] < array[smallestIndex]) {
                       smallestIndex = i;
               }
           }
           swap(array, smallestIndex, currentIndex);
           currentIndex++;
       }
       return array;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
