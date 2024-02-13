import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer numArr = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(numArr.nextToken());
        int b = Integer.parseInt(numArr.nextToken());
        int c = Integer.parseInt(numArr.nextToken());

        if (b > a && c > b){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}