// LeetCode 232: Implement Queue using Stacks - Two-stack approach with lazy transfer optimization
// Core Logic: Input stack for push, output stack for pop/peek, transfer only when output empty
import java.util.Stack;
//Implement queue using Stacks

public class q232 {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public q232() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
     public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

// push(){
//     s1.push(x);
// }

// top(){
//     if(s2!=empty) s2.top
//     else
//         s1->s2
//         s2.top
// }

// pop(){
//     if(s2!=empty) s2.pop();
//     else 
//         s1->s2
//         s2.pop
// }