package Arrays;

import java.util.Arrays;

public class MinimumWaitingTime {
    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int sum = 0;
        int arrayLength = queries.length;
        if(arrayLength == 0)
            return sum;
        for(int i=0;i<arrayLength;i++) {
            sum+=queries[i]*(arrayLength-1-i);
        }
        return sum;
    }
}
