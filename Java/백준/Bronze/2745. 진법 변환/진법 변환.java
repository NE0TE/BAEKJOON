import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();
        int tmp = 1;
        int result = 0;
        for(int i = n.length() - 1; i >=0; i--){
            char c = n.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                result += (c - 55) * tmp;
            }
            else{
                result += (c - 48) * tmp;
            }
            tmp *= b;
        }
        System.out.print(result);
	}
}