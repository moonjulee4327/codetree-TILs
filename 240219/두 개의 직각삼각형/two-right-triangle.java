import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int front = n;
        int back = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (front <= j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            front--;
            for (int k = 0; k < n; k++){
                if (back - 1 >= k){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            back++;
            System.out.println();
        }

        br.close();
    }
}