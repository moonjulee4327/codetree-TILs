import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int[] numArr = new int[10];
        while (a > 0){
            numArr[a % b]++;
            a /= b;
        }
        
        int result = 0;
        for (int i = 0; i < 10; i++){
            result += numArr[i] * numArr[i];
        }

        System.out.println(result);
        
        br.close();
    }
}