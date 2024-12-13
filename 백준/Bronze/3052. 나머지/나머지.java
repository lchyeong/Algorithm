import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();
        Set<Integer> answer = new HashSet<>();
        
        for(int i =0 ; i<10 ; i++){
            nums.add(sc.nextInt());
        }
        
        for(Integer num : nums){
            answer.add(num%42);
        }

        System.out.println(answer.size());
    }
}