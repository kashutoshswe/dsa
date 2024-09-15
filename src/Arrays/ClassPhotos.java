package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClassPhotos {
    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        // Write your code here.
        if(redShirtHeights.size() != blueShirtHeights.size())
            return false;

        Collections.sort(redShirtHeights, Collections.reverseOrder());
        Collections.sort(blueShirtHeights, Collections.reverseOrder());

        String whoIsInFirstRow = "BLUE";
        if(redShirtHeights.get(0) < blueShirtHeights.get(0))
            whoIsInFirstRow = "RED";

        for(int i = 0; i < blueShirtHeights.size(); i++) {
            int redShirt = redShirtHeights.get(i);
            int blueShirt = blueShirtHeights.get(i);
            if(whoIsInFirstRow.equals("RED"))
            {
                if(redShirt >= blueShirt)
                    return false;
            }
            else
            {
                if(blueShirt >= redShirt)
                    return false;
            }
        }
        return true;
    }
}
