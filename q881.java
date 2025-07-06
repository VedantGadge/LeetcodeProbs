import java.util.Arrays;

public class q881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
       while (left <= right) {
            // Try to pair lightest + heaviest person
            if (people[left] + people[right] <= limit) {
                left++; // Both people can go in the same boat
            }
            right--; // Heaviest person always goes in the boat
            boats++;
        }

        return boats;
    }
}
