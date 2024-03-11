import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a' && 'z' >= c){
                c = (char) (c - 32);
            }else {
                c = (char) (c + 32);
            }
            System.out.print(c);
        }

        br.close();
    }
}