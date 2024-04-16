import java.lang.StringBuilder;

class Solution
{
    //빌더는 삭제할때마다 문자열을 반복적으로 순회해서 효율 떨어짐.애초에 문자열과 비교해가면서 연속된 문자열이 나올경우 아예 추가를 안하고 삭제해버림.
    public int solution(String s)
    {
        StringBuilder stack = new StringBuilder();
        
        for(char c : s.toCharArray()){
            int length = stack.length();
            if(length>0 && stack.charAt(length -1)==c){
                stack.deleteCharAt(length - 1);
            }else{
                stack.append(c);
            }
        }
        return stack.length() == 0 ? 1 : 0;
        
        
        
        
        /*int answer = 0;
        StringBuilder a = new StringBuilder(s);
        for(int i=0 ; i<a.length()-1; ){
            if(a.charAt(i) == a.charAt(i+1)){
                a.delete(i,i+2);
                i=0;
            }else{
                i++;    
            }
            
        }
        
        if(a.length()==0) return 1;
        return 0;
        */
    }
}