import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseCount = Integer.parseInt(bufferedReader.readLine());


        for(int i=0; i<testCaseCount; i++){
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            String sum = String.valueOf(A + B);
            bufferedWriter.write("Case #"+ (i+1) + ": " + sum + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
