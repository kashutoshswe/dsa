package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        return productSumHelper(array, 1);
    }

    public static int productSumHelper(List<Object> array, int multiplier)
    {
        int sum = 0;
        for (Object eachObject : array) {
            if (eachObject instanceof ArrayList<?>)
                sum += productSumHelper((List<Object>) eachObject, multiplier++);
            else
                sum += (Integer) eachObject;
        }
        return sum;
    }
}
