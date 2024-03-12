import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        printRect(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        br.close();
    }

    public static void printRect(int n, int m){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}