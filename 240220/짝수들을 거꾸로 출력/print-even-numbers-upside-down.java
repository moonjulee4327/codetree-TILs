import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");

        int[] numArr = new int[n];

        for (int i = n - 1; i >= 0; i--){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int num : numArr){
            if (num % 2 != 0){
                System.out.print("");
            }else {
                System.out.print(num + " ");
            }
        }

        br.close();
    }
}