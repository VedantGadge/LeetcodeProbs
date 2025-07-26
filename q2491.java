import java.util.Arrays;

class q2491{
    public long dividePlayers(int[] skill) {
        int sum = 0;
        int targetSum = 0;
        long chemistry = 0;
        for(int i: skill){
            sum+=i;
        }
        if(sum%(skill.length/2)==0){
            targetSum = sum/(skill.length/2);
        }
        else return -1;
        Arrays.sort(skill);
        int left = 0;
        int right = skill.length-1;
        while(left<right){
            if(skill[left]+skill[right]!=targetSum) return -1;
            else {
                chemistry+=skill[left]*skill[right];
                left++; right--;
            }
            
        }
        return chemistry;
    }
}