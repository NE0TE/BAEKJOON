import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int[] alphabet = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (alphabet[c - 'a'] == -1) {
                alphabet[c - 'a'] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
