import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int I = in.nextInt();
        System.out.print(S.charAt(I-1));
	}
}