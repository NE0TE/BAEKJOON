import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        if(A==B&&B==C){
            System.out.print(10000+(A*1000));
        }
        else if((A==B&&B!=C)||(A!=B&&B==C)||(A==C&&A!=B)){
            if((A==B&&B!=C)||(A!=B&&B==C)){
                System.out.print(1000+(B*100));
            }
            else if(A==C&&A!=B){
                System.out.print(1000+(A*100));
            }
        }
        else if (A!=B&&B!=C&&C!=A){
            int MAX = A;
            if(B>MAX){
                MAX=B;
            }
            if (C>MAX){
                    MAX=C;
                }
            System.out.print(MAX*100);
        }
	}
}