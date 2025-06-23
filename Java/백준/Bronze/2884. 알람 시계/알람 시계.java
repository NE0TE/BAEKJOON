import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int Hour = in.nextInt();
        int Min = in.nextInt();
        if (Min<45){
            Hour--;
            Min=60-(45-Min);
            if (Hour<0){
                Hour=23;
            }
        }
        else{
            Min=Min-45;
        }
        System.out.print(Hour+" "+Min);
	}
}