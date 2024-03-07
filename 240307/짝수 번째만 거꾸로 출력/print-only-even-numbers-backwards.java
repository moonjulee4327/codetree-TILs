import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] staCharArr = str.toCharArray();
        String result = "";
        for (int i = staCharArr.length; i > 0; i--){
            if(i % 2 == 1){
                result += staCharArr[i];
            }
        }

        System.out.println(result);
        br.close();
    }
}