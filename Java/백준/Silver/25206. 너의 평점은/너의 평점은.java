import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0, credit_sum = 0;

        for(int i = 0; i < 20; i++){
            String[] str_arr = sc.nextLine().split(" ");
            double credit = Double.parseDouble(str_arr[1]);
            String gradeStr = str_arr[2];
            
            double grade = 0;
            char c = gradeStr.charAt(0);
            char plusMinus = (gradeStr.length() > 1) ? gradeStr.charAt(1) : '0';

            switch(c){
                case 'A':
                    grade = (plusMinus == '+') ? 4.5 : 4.0;
                    break;
                case 'B':
                    grade = (plusMinus == '+') ? 3.5 : 3.0;
                    break;
                case 'C':
                    grade = (plusMinus == '+') ? 2.5 : 2.0;
                    break;
                case 'D':
                    grade = (plusMinus == '+') ? 1.5 : 1.0;
                    break;
                case 'F':
                    grade = 0;
                    break;
                case 'P':
                    credit = 0;
                    grade = 0;
                    break;
                default:
                    credit = 0;
                    grade = 0;
                    break;
            }

            credit_sum += credit;
            result += credit * grade;
        }

        sc.close();

        if(credit_sum == 0){
            System.out.println(0.0);
        } else {
            System.out.println(result / credit_sum);
        }
    }
}