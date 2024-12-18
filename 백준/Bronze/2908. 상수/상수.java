import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Integer> list = new ArrayList<>();

        input = input.trim();

        String[] nums = input.split(" ");

        for(String num : nums){
            String reverse = new StringBuilder(num).reverse().toString();
            list.add(Integer.parseInt(reverse));
        }

        Collections.sort(list);

        System.out.println(list.get(1));
    }
}