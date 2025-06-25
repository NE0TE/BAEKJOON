import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] array = new int[N];
        for(int x = 0; x < N; x++){
            array[x] = x + 1;
        }
        for(int x = 0; x < M; x++){
            int i = in.nextInt();
            int j = in.nextInt();
            for (int y = 0; y < (j - i + 1) / 2; y++){
                int z = array[i - 1 + y];
                array[i - 1 + y] = array[j - 1 - y];
                array[j - 1 - y] = z;
            }
        }
        for(int x = 0; x < N; x++){
            System.out.print(array[x]+" ");
        }
	}
}