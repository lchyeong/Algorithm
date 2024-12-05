import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        String i = scanner.nextLine();

        Character answer = S.charAt(Integer.parseInt(i) - 1);

        System.out.println(answer);
        scanner.close();
    }
}