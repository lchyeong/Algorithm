import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> N = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<28 ; i++){
            N.add(sc.nextInt());
        }


        for (int i = 1; i <= 30; i++) {
            if (!N.contains(i)) {
                answer.add(i);
            }
        }
        
        answer.sort(Integer::compareTo);
        System.out.println(answer.get(0));
        System.out.println(answer.get(1));
    }
}