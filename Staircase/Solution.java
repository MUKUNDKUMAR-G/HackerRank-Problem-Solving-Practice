import java.io.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int space = 1; space <= (n - i); space++) {
                System.out.print(" ");
            }
            // Print hashes
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            // Move to the next line
            System.out.println();
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the size of the staircase
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Call the staircase function
        Result.staircase(n);

        bufferedReader.close();
    }
}
