import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> strs = new ArrayList<>();

        while (sc.hasNextLine()){
            strs.add(sc.nextLine());
        }

        for(String str : strs){
            System.out.println(str);
        }
    }
}
