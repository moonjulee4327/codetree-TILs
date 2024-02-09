import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phoneNumber = br.readLine();
        StringTokenizer st = new StringTokenizer(phoneNumber, "-");

        StringBuilder sb = new StringBuilder();
        sb.append(st.nextToken() + "-");
        String x = st.nextToken();
        String y = st.nextToken();
        sb.append(y + "-");
        sb.append(x);

        System.out.println(sb);
    }
}