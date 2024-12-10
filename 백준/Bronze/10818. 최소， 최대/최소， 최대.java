import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        int N = sc.nextInt();

        for(int i = 0 ; i < N; i++){
           nums.add(sc.nextInt());
        }
        nums.sort(Integer::compareTo);

        int max = nums.get(nums.size()-1);
        int min = nums.get(0);
        System.out.println(min);
        System.out.println(max);

    }
}