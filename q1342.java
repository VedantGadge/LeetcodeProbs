public class q1342 {

    static int nos(int num , int steps){
        if(num==0) return steps;
        if(num%2==0) return nos(num/2, ++steps);
        else return nos(--num, ++steps);
    }

    static int numberOfSteps(int num) {
        if(num==0) return 0;
        return nos(num,0);
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
}
