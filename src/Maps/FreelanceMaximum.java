package Maps;

import java.util.Arrays;
import java.util.Map;

public class FreelanceMaximum {
    public int optimalFreelancing(Map<String, Integer>[] jobs) {
        if(jobs.length == 0)
            return 0;
        int profit = 0;
        int maxDays = 7;
        String payment = "payment";
        boolean[] daysArray = new boolean[maxDays];

        // Sorting the array based on "payment" in descending order
        Arrays.sort(jobs, (mapA, mapB) -> {
            // Compare the "payment" values of the maps
            Integer paymentA = mapA.get(payment);
            Integer paymentB = mapB.get(payment);
            return paymentB.compareTo(paymentA);  // Descending order
        });

        for (Map<String, Integer> job : jobs) {
            int maxTime = Math.min(job.get("deadline"), maxDays);
            // from maxTime we need to back trace and then mark them as true
            for (int i = maxTime-1; i >= 0; i--) {
                if(!daysArray[i])
                {
                    daysArray[i] = true;
                    profit += job.get(payment);
                    break;
                }
            }
        }
        return profit;
    }

}
