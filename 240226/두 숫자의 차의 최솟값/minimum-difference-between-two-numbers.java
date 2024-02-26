import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] numArr = new int[10];

        int result = 99;
        for (int i = 0; i < n; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
            if (numArr[i] == 0 || i == 0){
                continue;
            }

            int min = numArr[i] - numArr[i - 1];
            if (min < result) {
                result = min;
            }
        }
        System.out.println(result);
        br.close();
    }
}