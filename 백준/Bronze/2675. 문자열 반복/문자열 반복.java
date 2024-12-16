import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        
        List<String> input = new ArrayList<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            input.add(sc.nextLine());
        }

        for (int i = 0; i < input.size(); i++) {
            int X = input.get(i).charAt(0) - '0';
            String en = input.get(i).substring(2);
            StringBuilder sb = new StringBuilder();
            for (int n = 0; n < en.length(); n++) {
                for (int j = 0; j < X; j++) {
                    sb.append(en.charAt(n));
                }
            }
            answer.add(sb.toString());
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }
}