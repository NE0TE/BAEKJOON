import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int count = 1;
        String str = in.nextLine();
        str=str.trim();
        if(str.equals("")){
            System.out.print("0");
            return;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.print(count);
	}
}