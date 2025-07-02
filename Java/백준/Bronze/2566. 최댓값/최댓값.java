import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[][] num = new int[9][9];
        int max = 0;
        int max_x = 0;
        int max_y = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                num[i][j] = sc.nextInt();
                if((i == 0 && j == 0) || num[i][j] > max){
                    max = num[i][j];
                    max_x = i + 1;
                    max_y = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.print(max_x + " " + max_y);
	}
}