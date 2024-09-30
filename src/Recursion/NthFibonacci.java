package Recursion;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacci {
    static Map<Integer, Integer> alreadyComputed = new HashMap<>();
    public static int getNthFib(int n) {
        if(n == 0 || n == 1)
            return n;
        if(alreadyComputed.containsKey(n))
            return alreadyComputed.get(n);
        int sum =  getNthFib(n - 1) + getNthFib(n - 2);
        alreadyComputed.put(n, sum);
        return sum;
    }
}
