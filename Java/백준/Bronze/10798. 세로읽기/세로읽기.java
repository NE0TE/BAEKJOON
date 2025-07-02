import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char[][] word = new char[5][15];
        for(int i = 0; i < 5; i++){
            String str = sc.nextLine();
            for(int j = 0; j < str.length(); j++){
                word[i][j] = str.charAt(j);
            }
        }
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(i < word[j].length && word[j][i] != '\0'){
                    System.out.print(word[j][i]);
                }
            }
        }
	}
}