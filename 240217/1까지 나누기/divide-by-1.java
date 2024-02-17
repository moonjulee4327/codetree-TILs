import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int x = 0;
        while (true){
            n /= ++x;
            if (n < 1){
                break;
            }
        }
        System.out.println(x);
        br.close();
    }
}