// LeetCode 451: Sort Characters By Frequency - HashMap frequency counting with PriorityQueue sorting by count
// Core Logic: Count character frequencies in HashMap, use max-heap PriorityQueue to sort by frequency descending

import java.util.HashMap;
import java.util.PriorityQueue;

public class q451 {
    public static void main(String[] args) {
        String s  = "tree";
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c,freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> heap = new PriorityQueue<>(
            (a,b) -> freq.get(b) - freq.get(a)
        );
        heap.addAll(freq.keySet());

        StringBuilder ans = new StringBuilder();
        while(!heap.isEmpty()){
            char c = heap.poll();
            int count = freq.get(c);
            for(int i = 1;i<=count;i++){
                ans.append(c);
            }
        }
        System.out.println(ans.toString());
    }
}
