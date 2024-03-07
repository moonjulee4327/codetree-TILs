import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        int cnt = 0;
        for (int i = 0; i < n; i++){
            str[i] = br.readLine();
        }

        char ch = br.readLine().charAt(0);
        int strLeng = 0;
        for (int i = 0; i < n; i++){
            if (str[i].charAt(0) == ch){
                cnt++;
                strLeng += str[i].length();
            }
        }

        double strLengAvg = strLeng / cnt;
        System.out.printf("%d %.2f", cnt, strLengAvg);

        br.close();
    }
}