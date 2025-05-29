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