class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
      
        
        //노란 타일은 (x-2)*(y-2)가 충족이 되어야함.나머지가 0이면 나눠진다는 소리고 j값을 구할수있다. j값은 결국 i값보다 커진다.
        for(int i=1 ;i<=Math.sqrt(sum) ; i++){
            if(sum%i == 0){
                int j= sum/i;
                
                if((i-2) * (j-2) == yellow){
                    answer[0]=j;
                    answer[1]=i;
                    break;
                }
            }
        }
        
        
        /* 값이 같은 경우 문제가 되네....
        for(int i=1 ;i<=Math.sqrt(sum) ; i++){
            for(int j=((int)Math.sqrt(sum)+1) ; j>=1; j-- ){
                if(i*j == sum){
                    answer[0]=j;
                    answer[1]=i;
                }
            }
        }
        */
     
        return answer;
    }
}
