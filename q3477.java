
public class q3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int placed = 0;
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (baskets[j] >= fruits[i]) {
                    baskets[j] = 0;
                    placed++;
                    break;
                }
            }
        }
        return fruits.length - placed;
    }
}
