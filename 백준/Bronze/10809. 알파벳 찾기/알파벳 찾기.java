import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Integer> en = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            en.add(-1);
        }

        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if ('a' <= x && x <= 'z') {
                int index = x - 'a';
                if (en.get(index) == -1) {
                    en.set(index, i);
                }
            }
        }
        String result = String.join(" ", en.stream()
                .map(String::valueOf)
                .toArray(String[]::new));
        System.out.println(result);
    }
}