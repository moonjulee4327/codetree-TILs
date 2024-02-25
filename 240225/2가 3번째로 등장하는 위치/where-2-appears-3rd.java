import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int cnt = 0;
        int i;
        for (i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if (num == 2){
                cnt++;
                if (cnt == 3){
                    break;
                }
            }
        }
        System.out.println(i + 1);
        br.close();
    }
}