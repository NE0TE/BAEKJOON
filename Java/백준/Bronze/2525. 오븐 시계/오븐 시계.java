import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int Hour = in.nextInt();
        int Min = in.nextInt();
        int Oven = in.nextInt();
        Min += Oven;
        Hour += Min / 60;
        Min %= 60;
        Hour %= 24;
        System.out.print(Hour + " " + Min);
	}
}