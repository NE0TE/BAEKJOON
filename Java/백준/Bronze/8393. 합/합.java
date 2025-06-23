import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Sum = 0;
        for(int i=1;i<=N;i++){
            Sum=Sum+i;
        }
        System.out.print(Sum);
	}
}