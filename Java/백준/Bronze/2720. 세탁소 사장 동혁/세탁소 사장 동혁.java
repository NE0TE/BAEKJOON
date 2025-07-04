import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int C = sc.nextInt();
            int q = 0;
            int d = 0;
            int n = 0;
            int p = 0;
            q = C / 25;
            C -= q * 25;
            d = C / 10;
            C -= d * 10;
            n = C / 5;
            C -= n * 5;
            p = C / 1;
            C -= p;
            System.out.println(q + " " + d + " " + n + " " + p);
        }
	}
}