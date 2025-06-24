import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] Array = new int[N];
        int Max = 0;
        int Min = 0;
        for(int i=0;i<N;i++){
            Array[i] = in.nextInt();
            if(i==0){
                Max = Array[0];
                Min = Array[0];
            }
            if (Array[i]>Max){
                Max=Array[i];
            }
            if (Array[i]<Min){
                Min=Array[i];
            }
        }
        System.out.print(Min+" "+Max);
	}
}