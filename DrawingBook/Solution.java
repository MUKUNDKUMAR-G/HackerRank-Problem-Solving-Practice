import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println(pageCount(n, p));
    }

    public static int pageCount(int n, int p) {
        // Turns from the front of the book
        int frontTurns = p / 2;

        // Turns from the back of the book
        int backTurns = (n / 2) - (p / 2);

        // Minimum of turns from front and back
        return Math.min(frontTurns, backTurns);
    }
}
