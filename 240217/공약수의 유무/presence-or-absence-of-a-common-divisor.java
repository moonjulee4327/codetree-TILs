import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ab = br.readLine();
        StringTokenizer st = new StringTokenizer(ab, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean flag = false;
        for (int i = a; i <= b; i++){
            if (1920 % i == 0 && 2880 % i == 0){
                flag = true;
                break;
            }
        }

        System.out.println(flag ? 1 : 0);
        br.close();
    }
}