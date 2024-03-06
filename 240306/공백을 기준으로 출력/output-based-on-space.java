import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine().replaceAll(" ", "");
        String str2 = br.readLine().replaceAll(" ", "");

        System.out.println(str1 + str2);
        br.close();
    }
}