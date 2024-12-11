import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> inputs = new ArrayList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> buckets = new ArrayList<>();


        for(int i=0 ; i<N ; i++){
            buckets.add(i+1);
        }

        for(int i = 0 ; i <M ; i++){
            List<Integer> input = new ArrayList<>();
            for(int j = 0; j < 2 ; j++){
                input.add(sc.nextInt());
            }
            inputs.add(input);
        }

        for (List<Integer> a : inputs) {
            swapBalls(a.get(0), a.get(1), buckets);
        }

        String result = buckets.stream()
                        .map(String::valueOf)
                                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

    private static void swapBalls(int x,int y, List<Integer> buckets){
       int a = buckets.get(x-1);
       int b = buckets.get(y-1);

       buckets.set(x-1,b);
       buckets.set(y-1,a);
    }
}