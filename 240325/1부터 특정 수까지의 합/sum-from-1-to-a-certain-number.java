import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(numDiv(a));
    }

    public static int numDiv(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum / 10;
    }
}