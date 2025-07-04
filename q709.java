import java.util.LinkedList;

// using hashing n buckets linked list
public class q709{
    static final int size = 769;
    LinkedList<Integer>[] buckets;

    public void q705(){
        buckets = new LinkedList[size];
        for(int i = 0;i<size;i++){
            buckets[i] = new LinkedList<>();
        }
    }

    int hash(int key){
        return key % size;
    }

    public void add (int key){
        int id = hash(key);
        if(!buckets[id].contains(key)) buckets[id].add(key);
    } 

    public void remove(int key){
        int id = hash(key);
        buckets[id].remove((Integer) key);
    }

    public boolean contains(int key) {
        int id = hash(key);
        return buckets[id].contains(key);
    }

}
















//using an array of boolean
// public class q705 {
//     private boolean []obj;
//     public q705() {
//         obj = new boolean[1_000_001];
//     }
    
//     public void add(int key) {
//            obj[key] = true;
//   }    
//     public void remove(int key) {
//            obj[key] = false;
//     }
    
//     public boolean contains(int key) {
//         return obj[key];
//     } 
    
// }
