import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        int anw =0;


        anw = (H * 60) + M + C;

        H = anw / 60 % 24;
        M = anw % 60;
        System.out.println(H + " " +M);
    }
}