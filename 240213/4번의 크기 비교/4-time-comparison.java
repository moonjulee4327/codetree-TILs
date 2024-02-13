import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        StringTokenizer numArr = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < numArr.countTokens(); ){
            int bcde = Integer.parseInt(numArr.nextToken());
            if (a > bcde){
                System.out.println("1");
            }else {
                System.out.println("0");
            }
        }

    }
}