import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            int R = in.nextInt();
            String S = in.next();
            for(int j = 0; j < S.length() ; j++){
                char c = S.charAt(j);
                for(int z = 0; z < R; z++){
                    System.out.print(c);
                }
            }
            System.out.println();
        }
	}
}