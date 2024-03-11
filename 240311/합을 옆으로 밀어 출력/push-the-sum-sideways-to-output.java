import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += Integer.parseInt(br.readLine());
        }

        String shiftSum = String.valueOf(sum);
        System.out.println(shiftSum.substring(1) + shiftSum.substring(0, 1));

        br.close();
    }
}