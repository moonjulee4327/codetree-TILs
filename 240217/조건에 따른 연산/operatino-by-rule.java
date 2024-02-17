import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (true){
            if (n % 2 == 0){
                n = (n * 3) + 1;
            }else {
                n = (n * 2) + 2;
            }
            cnt++;
            if (n >= 1000){
                break;
            }
        }

        System.out.println(cnt);
        br.close();
    }
}