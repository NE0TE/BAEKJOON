import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int Year = in.nextInt();
        if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0) {
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
	}
}