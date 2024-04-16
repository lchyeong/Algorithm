class Solution {
    public int solution(int n) {
          if (n <= 1) {
            return n;
        }
        
        // Using long for larger Fibonacci numbers, though we're ultimately interested in int results
        long prev = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            long next = (prev + current)% 1234567;
            prev = current;
            current = next;
        }
        
        // The final answer is within int range due to modulo operation
        return (int)current;
    }
    
}