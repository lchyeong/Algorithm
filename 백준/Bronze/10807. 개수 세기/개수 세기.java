
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int found = 0;
        int answer = 0;
        List<Integer> nums = new ArrayList<>();

        for(int i =0 ; i<count ; i++){
            nums.add(sc.nextInt());
        }

        found = sc.nextInt();

        for(int i =0 ; i < nums.size(); i++){
            if(nums.get(i) == found){
                answer++;
            }
        }
        System.out.println(answer);

    }
}