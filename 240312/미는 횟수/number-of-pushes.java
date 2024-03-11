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
            if (str1.equals(str)){
                cnt = i;
                break;
            }
            str1 = str1.substring(str1.length() - 1, str1.length()) + str1.substring(0, str1.length() - 1);
        }

        System.out.println(cnt);

        br.close();
    }
}