import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> inputs = new ArrayList<>();
        int bucket = sc.nextInt();
        int count = sc.nextInt();
        List<Integer> buckets = new ArrayList<>(Collections.nCopies(bucket,0));

        for(int i = 0 ; i <count ; i++){
            List<Integer> input = new ArrayList<>();
            for(int j = 0; j < 3 ; j++){
                input.add(sc.nextInt());
            }
            inputs.add(input);
        }

        for (List<Integer> a : inputs) {
            buckets = inputBalls(a.get(0), a.get(1), a.get(2), buckets);
        }

        String result = buckets.stream()
                        .map(String::valueOf)
                                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

    private static List<Integer> inputBalls(int start, int end, int num, List<Integer> buckets){
       for(int i=start-1 ; i < end; i++){
           buckets.set(i,num);
       }
       return buckets;
    }
}