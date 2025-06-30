import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int count = 0;
        for(int i = 0; i < num.length(); i++){
            char N = num.charAt(i);
            if(N == 'A' || N == 'B' || N == 'C'){
                count += 3;
            }
            else if(N == 'D' || N == 'E' || N == 'F'){
                count += 4;
            }
            else if(N == 'G' || N == 'H' || N == 'I'){
                count += 5;
            }
            else if(N == 'J' || N == 'K' || N == 'L'){
                count += 6;
            }
            else if(N == 'M' || N == 'N' || N == 'O'){
                count += 7;
            }
            else if(N == 'P' || N == 'Q' || N == 'R' || N == 'S'){
                count += 8;
            }
            else if(N == 'T' || N == 'U' || N == 'V'){
                count += 9;
            }
            else if(N == 'W' || N == 'X' || N == 'Y' || N == 'Z'){
                count += 10;
            }
            else{
                count += 11;
            }
        }
        System.out.print(count);
	}
}