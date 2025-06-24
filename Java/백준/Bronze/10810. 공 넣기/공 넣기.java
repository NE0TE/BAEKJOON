import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] array = new int[N];
        for(int x=0;x<M;x++){
            int i = in.nextInt();
            int j = in.nextInt();
            int k = in.nextInt();
            for (int y=i-1;y<=j-1;y++){
                array[y]=k;
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(array[i]+" ");
        }
	}
}