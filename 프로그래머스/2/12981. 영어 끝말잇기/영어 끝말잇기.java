
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Solution {
        public int[] solution(int n, String[] words) {
        //GPT 풀이.......;;;
            
        int[] answer = {0, 0};
        Set<String> seenWords = new HashSet<>(); // To store words that have been seen
        seenWords.add(words[0]); // Adding the first word to the set
        char lastChar = words[0].charAt(words[0].length() - 1); // Last character of the first word

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];

            // Check if the word has already been said or if it doesn't follow the last letter rule
            if (seenWords.contains(currentWord) || lastChar != currentWord.charAt(0)) {
                answer[0] = (i % n) + 1; // Player number (1-based index)
                answer[1] = (i / n) + 1; // Round number (1-based index)
                return answer;
            }

            // Add the current word to the set of seen words
            seenWords.add(currentWord);
            // Update lastChar to the last character of the current word
            lastChar = currentWord.charAt(currentWord.length() - 1);
        }

        // Return {0, 0} if no errors were found
        return answer;
            
            
            
            
            
            
            //나의 풀이
            /* int[] answer = {0,0};
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
            */
    }
}
