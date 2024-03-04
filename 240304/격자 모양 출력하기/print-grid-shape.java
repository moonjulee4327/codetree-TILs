import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int[][] inputArr = new int[n][2];
        int[][] outputArr = new int[n][n2];
        int i;
        int j;
        for (i = 0; i < n2; i++){
            StringTokenizer inputSt = new StringTokenizer(br.readLine(), " ");
            for (j = 0; j < 2; j++){
                inputArr[i][j] = Integer.parseInt(inputSt.nextToken());
            }
            outputArr[inputArr[i][0] - 1][inputArr[i][1] - 1] = inputArr[i][0] * inputArr[i][1];
        }

        for (int[] arr : outputArr){
            for (int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        br.close();
    }
}