package Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int counter = 0;
        while(!isSorted)
        {
            isSorted = true;
            for(int i = 0; i < array.length-1-counter; i++)
            {
                if(array[i] > array[i+1])
                {
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
            counter++;
        }
        return array;
    }

    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
