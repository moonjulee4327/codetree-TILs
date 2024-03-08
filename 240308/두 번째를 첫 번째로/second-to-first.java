import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char repeatChar = str.charAt(1);
        char[] strArr = str.toCharArray();

        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == repeatChar){
                strArr[i] = strArr[0];
            }
        }

        for (char c : strArr){
            System.out.print(c);
        }

        br.close();
    }
}