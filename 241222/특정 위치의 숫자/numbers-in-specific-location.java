import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
        List<Integer> input = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            input.add(sc.nextInt());
        }
        System.out.println(input.get(2) + input.get(4) + input.get(input.size() - 1));
    }
}