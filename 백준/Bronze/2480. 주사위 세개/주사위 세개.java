import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println(dice(a, b, c));
        sc.close();
        // 다른 풀이 더 깔끔하게
//        int dice(int a, int b, int c) {
//            if (a == b && b == c) {
//                return 10000 + a * 1000;
//            } else if (a == b || a == c) {
//                return 1000 + a * 100;
//            } else if (b == c) {
//                return 1000 + b * 100;
//            } else {
//                return Math.max(a, Math.max(b, c)) * 100;
//            }
//        }
    }

    static int dice(int a, int b, int c){
        if( a == b && b == c){
            return 10000 + a*1000;
        }else if( a == b || a == c || b == c){
            if (a == b || a == c) {
                return 1000 + a*100;
            }
            return 1000 + b*100;
        }else{
            int max = Math.max(a, Math.max(b, c));
            return max*100;
        }
    }
}