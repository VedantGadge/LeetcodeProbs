public class q217 {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store the unique elements.
        HashSet<Integer> set = new HashSet<>();
        
        // Iterate over each element in the array.
        for (int num : nums) {
            // If the element already exists in the set, it's a duplicate.
            if (!set.add(num)) {
                return true;
            }
        }
        
        // If no duplicates were found, return false.
        return false;
    }
    public static void main(String[] args) {
        
    }
}
