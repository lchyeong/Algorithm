class Solution {
    boolean solution(String s) {
        boolean answer = true;

        StringBuilder a = new StringBuilder();
        a.append(s);
        int bal=0;
        if(a.charAt(0)==')' || a.charAt(a.length()-1) == '('){
                return false;
            }
        
        for(int i=0 ; i<a.length() ; i++){
            if(a.charAt(i) == '('){
                bal++;
                
            }else
                bal--;
            
            if(bal<0) return false;
        }
        
        if(bal==0) return true;
        return false;
    }
}
/*
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        // Create a stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If the character is an opening parenthesis, push it onto the stack
            if (c == '(') {
                stack.push(c);
            } else {
                // If the stack is empty when a closing parenthesis is encountered,
                // it means there is no matching opening parenthesis, so return false
                if (stack.isEmpty()) {
                    return false;
                }
                // If the stack is not empty, pop the top element from the stack.
                // This assumes a matching pair has been found.
                stack.pop();
            }
        }
        
        // If the stack is empty at the end, all parentheses were matched correctly
        return stack.isEmpty();
    }
}
*/