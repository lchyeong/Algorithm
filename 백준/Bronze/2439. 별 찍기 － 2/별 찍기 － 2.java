
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseCount = Integer.parseInt(bufferedReader.readLine());

        for(int i=0; i<testCaseCount; i++){

            for(int k = testCaseCount-i-1 ; k>0 ; k--){
                bufferedWriter.write(" ");
            }

            for(int j = 0 ; j<=i ; j++){
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}