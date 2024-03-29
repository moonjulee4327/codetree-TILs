import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");

        int[] numArr = new int[10];
        for (int i = 0; i < 10; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < 10; i++) {
            if (numArr[i] % 3 == 0) {
                System.out.println(numArr[i - 1]);
                break;
            }
        }
        
        br.close();
    }
}