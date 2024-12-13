import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Integer>> inputs = new ArrayList<>();
        List<Integer> bucket = new ArrayList<>();

        for(int i=1; i<=N ; i++){
            bucket.add(i);
        }

        for(int i =0 ; i<M ; i++){
            List<Integer> data = new ArrayList<>();
            data.add(sc.nextInt());
            data.add(sc.nextInt());
            inputs.add(data);
        }

        for(List<Integer> input : inputs ){

            int i = input.get(0);
            int j = input.get(1);

            List<Integer> sub = bucket.subList(i-1,j);
            Collections.reverse(sub);
        }
        String result = String.join(" ",
                bucket.stream()
                                .map(String::valueOf)
                                        .toArray(String[]::new));
        System.out.println(result);
    }
}