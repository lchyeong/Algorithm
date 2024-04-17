
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = {0,0};
            List<String> li = new ArrayList<>();
            List<String> li2 = new ArrayList<>();
            Collections.addAll(li, words);
            int len = li.size();
            int cnt = 1;


            for(int i=0 ; i<len ; i++){
                String str = li.get(i);

                //같은 단어를 말한 경우.
                if( li2.contains(str) && (li2.size() > 1) ){
                    int x = (li2.size()+1)-(n*cnt) + n;
                    answer[0] =x;
                    answer[1] =cnt;
                    break;
                }

                li2.add(str);
                //끝말을 잘못 이은경우

                if(i>0){
                    String c = li2.get(i-1);
                    if(c.charAt(c.length()-1) != str.charAt(0)){
                        int x = li2.size()-(n*cnt) + n;
                        answer[0] =x;
                        answer[1] =cnt;
                        break;
                    }
                }
                if(i>0 && i == (cnt*n - 1)){
                    cnt++;
                }
            }
            return answer;
    }
}