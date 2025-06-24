import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        for(;;){
            int A = in.nextInt();
            int B = in.nextInt();
            if (A==0&&B==0){
                System.exit(0);
            }
            System.out.println(A+B);
        }
	}
}