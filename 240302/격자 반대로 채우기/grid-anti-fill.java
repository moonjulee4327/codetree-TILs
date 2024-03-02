import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        int count = 1;

        for (int i = n - 1; i >= 0; i--){
            if (n % 2 == 0){
                if (i % 2 == 0){
                    for (int j = 0; j < n; j++){
                        arr[j][i] = count++;
                    }
                }else {
                    for (int j = n - 1; j >= 0; j--){
                        arr[j][i] = count++;
                    }
                }
            }else {
                if (i % 2 == 0){
                    for (int j = n - 1; j >= 0; j--){
                        arr[j][i] = count++;
                    }
                }else {
                    for (int j = 0; j < n; j++){
                        arr[j][i] = count++;
                    }
                }
            }
        }

        for (int[] numArr : arr){
            for (int numArr1 : numArr){
                System.out.print(numArr1 + " ");
            }
            System.out.println();
        }

        br.close();
    }
}