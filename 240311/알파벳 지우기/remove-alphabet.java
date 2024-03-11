import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str1 = br.readLine();

        String strNum = "";
        String strNum1 = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= '0' && '9' >= str.charAt(i)){
                strNum += str.charAt(i) + "";
            }
        }

        for (int i = 0; i < str1.length(); i++){
            if (str1.charAt(i) >= '0' && '9' >= str1.charAt(i)){
                strNum1 += str1.charAt(i) + "";
            }
        }

        System.out.println(Integer.parseInt(strNum) + Integer.parseInt(strNum1));

        br.close();
    }
}