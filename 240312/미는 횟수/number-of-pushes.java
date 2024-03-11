import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str1 = br.readLine();

        int cnt = -1;
        for (int i = 0; i < str.length(); i++){
            if (str.equals(str1)){
                cnt = i;
                break;
            }
            str = str.substring(str.length() - 1, str.length()) + str.substring(0, str.length() - 1);
        }

        System.out.println(cnt);

        br.close();
    }
}