import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int total=0;

        for(int i =0 ; i< N; i++){
            int num = Character.getNumericValue(input.charAt(i));
            total += num;
        }
        System.out.println(total);
    }
}