import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        printNLines(Integer.parseInt(br.readLine()));
        br.close();
    }

    public static void printNLines(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 1; j++){
                System.out.print("12345^&*()_");
            }
            System.out.println();
        }
    }
}