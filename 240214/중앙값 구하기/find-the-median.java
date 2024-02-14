import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a > b){
            if (b > c){
                System.out.println(b);
            }else if (c > a) {
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }else if (b > c){
            if (a > c){
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }else {
            System.out.println(b);
        }
    }
}