import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int count = 1;
        int range = 2;
        int N = sc.nextInt();
        if (N == 1){
            System.out.print(1);
        }
        else{
            while (range <= N){
                range += 6 * count;
                count++;
            }
            System.out.print(count);
        }
	}
}