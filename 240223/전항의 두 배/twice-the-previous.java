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
        numArr[0] = a;
        numArr[1] = b;
        for (int i = 2; i < 10; i++){
            numArr[i] = numArr[i - 1] + (2 * numArr[i - 2]);
        }

        for (int num : numArr){
            System.out.print(num + " ");
        }

        br.close();
    }
}