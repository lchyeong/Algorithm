import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 스캐너 자원을 사용하고 나면 close() 메소드를 호출하여 닫아줘야 한다.
        try {
            int n = sc.nextInt();
            int[] arr = new int[n]; 

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[i] = a + b;
            }

            for (int i : arr) {
                System.out.println(i);
            }
        } finally {
            sc.close();
        }
    }
}