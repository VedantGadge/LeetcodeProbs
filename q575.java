// LeetCode 575: Distribute Candies - HashSet for unique types, return minimum of half candies and unique types
// Core Logic: Count unique candy types using HashSet, return min(candyType.length/2, uniqueTypes)

import java.util.HashSet;
public class q575{
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>  set = new HashSet<>();
        for(int candy: candyType){
            set.add(candy);
        }
        return Math.min(candyType.length/2, set.size());

    }
    public static void main(String[] args) {
        
    }

}