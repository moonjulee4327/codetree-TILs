import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        for (int i = 0; i < 5; i++){
            int n = Integer.parseInt(br.readLine());
            if (n % 3 == 0){
                cnt++;
            }
        }

        System.out.println(cnt == 5 ? 1 : 0);
        br.close();
    }
}