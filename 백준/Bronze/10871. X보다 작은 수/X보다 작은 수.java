import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> ans = new ArrayList<>();

        int N = sc.nextInt();
        int X = sc.nextInt();

        for(int i = 0 ; i < N; i++){
            int A = sc.nextInt();
            if(A < X){
                ans.add(A);
            }
        }

        for (Integer sum : ans){
            System.out.println(sum);
        }
    }
}