import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String order = br.readLine();

        for (int i = 0; i < order.length(); i++){
            if(order.charAt(i) == 'L'){
                str = str.substring(1, str.length()) + str.substring(0, 1);
            }else {
                str = str.substring(str.length() - 1, str.length()) + str.substring(0, str.length() - 1);
            }
        }

        System.out.println(str);

        br.close();
    }
}