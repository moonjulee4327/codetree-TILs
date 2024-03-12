import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        printNumRect(Integer.parseInt(br.readLine()));
        br.close();
    }

    public static void printNumRect(int n){
        int num = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (num >= 10){
                    num = 1;
                }
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}