// LeetCode 2410: Maximum Matching of Players With Trainers - Greedy matching on sorted arrays
// Core Logic: Sort both arrays, use two pointers, match when trainer >= player ability
import java.util.Arrays;

public class q2410 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        if(trainers.length == 0) return 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int player = 0;
        int trainer = 0;
        while(player < players.length && trainer < trainers.length){
            if(trainers[trainer]>=players[player]){
                player++;
            }
            trainer++;
        }
        return player;
    }
}
