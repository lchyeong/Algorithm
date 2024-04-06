class Solution {
    public String solution(String s) {
        String answer = "";
        s=s.toLowerCase();
        StringBuilder a = new StringBuilder();
        
        for(int i=0 ; i<s.length(); i++){
            if(i==0 && ' ' != s.charAt(0) && Character.isLetter(s.charAt(0))){
                char p= Character.toUpperCase(s.charAt(0));
                a.append(p);
                
            }else if(i>=1 && s.charAt(i - 1) == ' ' && Character.isLetter(s.charAt(i))){
                char p= Character.toUpperCase(s.charAt(i));
                a.append(p);
            }
        
            else {
                a.append(s.charAt(i));
            }
         }
        
        answer = a.toString();
        return answer;
    }
}