import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int Sum = 0;
        for(int i=0;i<N;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            Sum=Sum+(a*b);
        }
        if(X==Sum){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
	}
}