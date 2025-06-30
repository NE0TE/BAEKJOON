import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int King = 1 - sc.nextInt();
        int Queen = 1 - sc.nextInt();
        int Rook = 2 - sc.nextInt();
        int Bishop = 2 - sc.nextInt();
        int Knight = 2 - sc.nextInt();
        int Pawn = 8 - sc.nextInt();
        System.out.print(King + " " + Queen + " " + Rook + " " + Bishop + " " + Knight + " " + Pawn);
	}
}