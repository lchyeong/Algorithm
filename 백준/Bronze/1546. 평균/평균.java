
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Double> inputs = new ArrayList<>();
        double high = 0 ;
        double total = 0;

        for(int i=1; i<=N ; i++){
            inputs.add(sc.nextDouble());
        }

        inputs.sort(Double::compareTo);
        high = inputs.get(inputs.size()-1);

        for(int i=0 ; i<inputs.size(); i++){
            double x = inputs.get(i);
            double num = (x/high) *100;
            total += num;
        }

        System.out.println( total/inputs.size());
    }
}