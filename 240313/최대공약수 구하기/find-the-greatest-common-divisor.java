import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        gcd(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        br.close();
    }

    public static void gcd(int n, int m){
        int gcdNum = 0;
        for (int i = 1; i <= (n > m ? n : m); i++){
            if (n % i == 0 && m % i == 0){
                gcdNum = i;
            }
        }
        System.out.println(gcdNum);
    }
}