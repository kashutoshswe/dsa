package Arrays;

import java.util.*;

public class TournamentWinner {
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {
        int tournamentSize = results.size();
        HashMap<String, Integer> tournamentMap = new HashMap<>();
        String bestTeam = ""; //lookup the best team
        tournamentMap.put(bestTeam, 0);
        for (int i = 0; i <tournamentSize ; i++) {
            int outputResult = results.get(i) ^ 1;
            ArrayList<String> subCompetition = competitions.get(i);
            String winner = subCompetition.get(outputResult);
            if(tournamentMap.containsKey(winner))
            {
                int wonPoints = tournamentMap.get(winner)+3;
                tournamentMap.put(winner,wonPoints);
            }
            else
                tournamentMap.put(winner,3);

            int wonPoints = tournamentMap.get(winner)+3;
            if(wonPoints > tournamentMap.get(bestTeam))
                bestTeam = winner;
        }
        return bestTeam;
    }
}
