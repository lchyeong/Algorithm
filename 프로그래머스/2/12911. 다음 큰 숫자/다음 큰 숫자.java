public class Solution {
    public int solution(int n) {
        int count1 = countBits(n);
        int i = n + 1;
        
        while (countBits(i) != count1) {
            i++;
        }
        
        return i;
    }
    
    // Use Brian Kernighan's algorithm to count bits
    private int countBits(int number) {
        int count = 0;
        while (number != 0) {
            number &= (number - 1);
            count++;
        }
        return count;
    }
}