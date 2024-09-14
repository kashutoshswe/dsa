package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class TandemBicycle {
    public int tandemBicycle(
            int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest
    )
    {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        int sum = 0;
        if(fastest)
        {
            // for maximum, pairing of the smallest with the largest is done, to save the next largest for next pair
            for (int i = 0; i < redShirtSpeeds.length; i++) {
                sum+= Math.max(redShirtSpeeds[i], blueShirtSpeeds[blueShirtSpeeds.length-1-i]);
            }
        }
        else
        {
            // for minimum, next largest speed is eliminated
            for (int i = 0; i < redShirtSpeeds.length; i++) {
                sum+= Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
            }
        }
        return sum;
    }
}
