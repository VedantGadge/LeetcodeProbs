import java.util.HashMap;

class q3005{
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int num: nums){
            map.put(num,map.getOrDefault(num, 1)+1);
        }
        for(int num: map.keySet()){
            max = Math.max(max, map.get(num));
        }
        for(int num: nums){
            count+= map.get(num)==max ? 1 : 0; 
        }
        return count;
    }

}