import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
                str = str.substring(0, i) + str.substring(i + 1, str.length());
                break;
            }
        }

        System.out.println(str);

        br.close();
    }
}