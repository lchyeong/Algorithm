import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> ans = new ArrayList<>();

        while (sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();

            ans.add(A+B);
        }

        for (Integer sum : ans){
            System.out.println(sum);
        }
    }
}