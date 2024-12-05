import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.nextLine();
        
        String[] strs = new String[num];
        
        for(int i=0; i<num ; i++){
            strs[i] = sc.nextLine();
        }
        
        for(String str : strs){
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length()-1));
        }
    }
}