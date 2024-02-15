import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = "";
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            if (num % 2 != 0 && num % 3 == 0){
                str += num + "\n";
            }
        }
        System.out.println(str);
        br.close();
    }
}