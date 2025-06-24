import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int[] Array = new int[N];
        int sum;
        for(int i=0;i<N;i++){
            Array[i] = in.nextInt();
            if(Array[i]<X){
                System.out.print(Array[i]+" ");
            }
        }
	}
}