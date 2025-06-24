import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] array = new int[N];
        for(int i = 1; i <= N; i++){
            array[i-1]=i;
        }
        for(int x = 0; x < M; x++){
            int i = in.nextInt();
            int j = in.nextInt();
            int z;
            z = array[i-1];
            array[i-1] = array[j-1];
            array[j-1] = z;
        }
        for(int i = 0; i < N; i++){
            System.out.print(array[i]+" ");
        }
	}
}