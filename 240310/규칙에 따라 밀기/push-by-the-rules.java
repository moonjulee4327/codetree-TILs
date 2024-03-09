import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String order = br.readLine();

        int idx = 0;

        for (int i = 0; i < order.length(); i++){
            if(order.charAt(i) == 'L'){
                idx--;
            }else {
                idx++;
            }
        }

        if (idx > 0){
            System.out.println(str.substring(str.length() - idx, str.length()) + str.substring(0, str.length() - idx));
        }else {
            System.out.println(str.substring(idx * -1, str.length()) + str.substring(0, idx * -1));
        }

        br.close();
    }
}