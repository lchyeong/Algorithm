import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

//        int N = sc.nextInt();
        int max = 0;
        int count = 0;

        for(int i = 0 ; i < 9; i++){
           nums.add(sc.nextInt());
        }

        for(int i =0 ; i<9; i++){
            if(max < nums.get(i)) {
                max = nums.get(i);
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}