package Arrays;

import java.util.Arrays;

public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins)
    {
        if(coins.length == 0)
            return 1;
        Arrays.sort(coins);
        int totalChange = 0;
        for(int i = 0; i < coins.length; i++)
        {
            if(coins[i] <= (totalChange+1))
                totalChange = totalChange + coins[i];
            else
                return totalChange+1;
        }
        return totalChange+1;
    }
}
