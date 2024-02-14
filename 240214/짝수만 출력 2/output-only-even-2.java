import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int b = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        while (b >= a){
            System.out.print(b + " ");
            b -= 2;
        }
        br.close();
    }
}