import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N%4!=0){
            System.out.print("long ");
        }
        for (int i=0;i<(N/4);i++){
            System.out.print("long ");
        }
        System.out.print("int");
	}
}