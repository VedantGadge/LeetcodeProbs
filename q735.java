// LeetCode 735: Asteroid Collision - Stack simulation for collision detection between moving asteroids
// Core Logic: Use stack for rightward asteroids, handle collisions when leftward asteroid meets rightward ones

import java.util.ArrayDeque;
import java.util.Deque;

public class q735 {
    public int[] asteroidCollision(int[] asteroids) {
          Deque<Integer> stack = new ArrayDeque<>();
        for (int n : asteroids) {
            boolean alive = true;
            while (alive && !stack.isEmpty() && stack.peekLast() > 0 && n < 0) {
                int top = stack.peekLast();
                if (Math.abs(top) < Math.abs(n)) {
                    stack.pollLast();
                } else if (Math.abs(top) == Math.abs(n)) {
                    stack.pollLast();
                    alive = false;
                } else {
                    alive = false;
                }
            }
            if (alive) {
                stack.addLast(n);
            }
        }
        int[] ans = new int[stack.size()];
        int i = 0;
        for (int val : stack) {
            ans[i++] = val;
        }
        return ans;
    }
    }
