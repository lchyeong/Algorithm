import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        //3항연산자 사용
        //int y = (year % 4 == 0 && year%100 != 0 || year % 400 == 0) ? 1 : 0;
        //System.out.println(y);

        
        if (year % 4 == 0 && year%100 != 0 || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
