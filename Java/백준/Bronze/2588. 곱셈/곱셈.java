import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println((B%10)*A);
        System.out.println((B%100-B%10)*A/10);
        System.out.println((B/100)*A);
        System.out.println(A*B);
	}
}