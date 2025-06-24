import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        int sum = 0;
        for(int i=0;i<N;i++){
            array[i] = in.nextInt();
        }
        int v = in.nextInt();
        for(int i=0;i<N;i++){
            if(array[i]==v){
                sum++;
            }
        }
        System.out.print(sum);
	}
}