import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = "";
        int cnt = 0;
        for (int i = 0; i < n; i++){
            str += br.readLine();
        }

        char ch = br.readLine().charAt(0);
        char[] chars = str.toCharArray();
        for (char c : chars){
            if (ch == c){
                cnt++;
            }
        }

        double strLengAvg = str.length();
        System.out.printf("%d %.2f", cnt, strLengAvg);

        br.close();
    }
}