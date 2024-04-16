class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount =0;
        int count =0;
        
        while(s.length() != 1){
            int lengthBefore = s.length();        
             
            s= s.replace("0","");
            
            int lengthAfter = s.length();
                
            zeroCount+=(lengthBefore - lengthAfter);
        
            count++;  
            s=Integer.toBinaryString(s.length());
             
       }
        answer[1] = zeroCount;
        answer[0] = count;
        return answer;
    }
}