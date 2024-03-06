import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++){
            int len = br.readLine().length();
            if (len > max){
                max = len;
            }
            if (min > len){
                min = len;
            }
        }

        System.out.println(max - min);

        br.close();
    }
}