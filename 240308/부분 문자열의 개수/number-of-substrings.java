import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int cnt = 0;
        for (int i = 0; i < a.length() - 1; i++){
            if (a.charAt(i) == b.charAt(0) && a.charAt(i + 1) == b.charAt(1)){
                cnt++;
            }
        }

        System.out.println(cnt);

        br.close();
    }
}