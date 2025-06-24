import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        int sum=10;
        for(int i = 0; i < 10; i++){
            int A = in.nextInt();
            array[i] = A % 42;
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < i; j++){
                if (array[i] == array[j]){
                    sum--;
                    break;
                }
            }
        }
        System.out.print(sum);
	}
}