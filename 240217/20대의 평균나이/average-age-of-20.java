import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int cnt = 0;
        while (true){
            int age = Integer.parseInt(br.readLine());
            if (age >= 30){
                break;
            }
            sum += age;
            cnt++;
        }

        System.out.printf("%.2f", sum / cnt);
        br.close();
    }
}