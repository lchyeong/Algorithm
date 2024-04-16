import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] arr) {
   //우선 최소공배수를 구하는 함수 필요 gcd
   //배열의 인덱스 차례차례 두수씩 최소 공배수를 구해나감.
   //최소공배수를 다시 lcm함수의 파라미터로 전달. 그 다음 인덱스와 다시 최소공배수를 구함.
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        
        return lcm;
    }
// 두수의 최소 공배수 구하는 공식 두수의 곱을 최대공약수로 나누면 됨.
public int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    
//두수의 최대 공약수 구하는 방법...나머지 활용. 나눠지면 아웃
public int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
}
}