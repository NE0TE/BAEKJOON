import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] array = new int[9];
        int Max = 0;
        int MaxAdd = 0;
        for(int i=0;i<9;i++){
            array[i] = in.nextInt();
            if(i==0||Max<array[i]){
                Max = array[i];
                MaxAdd = i+1;
            }
        }
        System.out.println(Max);
        System.out.print(MaxAdd);
	}
}