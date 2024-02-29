import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stNM = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(stNM.nextToken());
        int m = Integer.parseInt(stNM.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr1[i][j] == arr2[i][j]){
                    arr1[i][j] = 0;
                }else {
                    arr1[i][j] = 1;
                }
            }
        }

        for (int[] numArr : arr1){
            for (int num : numArr){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        br.close();
    }
}