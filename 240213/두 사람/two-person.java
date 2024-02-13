import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st1 = new StringTokenizer(a, " ");
        String b = br.readLine();
        StringTokenizer st2 = new StringTokenizer(b, " ");

        if ((Integer.parseInt(st1.nextToken()) > 19 && st1.nextToken().equals("M")) ||
            (Integer.parseInt(st2.nextToken()) > 19 && st2.nextToken().equals("M"))){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}