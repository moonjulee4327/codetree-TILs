import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int bookPrice = 3000;
        int maskPrice = 1000;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        if (n >= bookPrice){
            System.out.println("book");
        } else if (n >= maskPrice) {
            System.out.println("mask");
        }else {
            System.out.println("no");
        }
    }
}