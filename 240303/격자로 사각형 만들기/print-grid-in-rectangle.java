import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == 0 || j == 0){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1] + arr[i - 1][j - 1];
                }
            }
        }

        for (int[] numArr : arr){
            for (int num : numArr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        br.close();
    }
}