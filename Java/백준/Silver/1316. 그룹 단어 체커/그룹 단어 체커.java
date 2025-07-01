import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (check(sc)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

    public static boolean check(Scanner sc) {
        boolean[] visited = new boolean[26];
        String str = sc.next();
        char prev = 0;

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);

            if (now != prev) {
                if (!visited[now - 'a']) {
                    visited[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
}
}