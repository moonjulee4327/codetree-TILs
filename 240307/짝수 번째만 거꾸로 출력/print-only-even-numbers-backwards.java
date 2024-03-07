import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int idx = str.length() - 1;
        if (str.length() % 2 != 0){
            idx--;
        }

        for (int i = idx; i > 0; i -= 2){
            System.out.print(str.charAt(i));
        }

        br.close();
    }
}