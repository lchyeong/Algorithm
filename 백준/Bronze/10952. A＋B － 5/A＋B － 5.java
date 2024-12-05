import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> answer = new ArrayList<>();
        
        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A == 0 && B == 0){
                break;
            }          
            answer.add(A+B);          
        }
        
        for(Integer num : answer){
            System.out.println(num);
        }   
    }
}