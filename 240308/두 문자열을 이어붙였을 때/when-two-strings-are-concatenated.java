import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        String ab = a + b;
        String ba = b + a;

        if (ab.equals(ba)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        br.close();
    }
}