import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        // Traverse the list to find all subarrays of length 'm'
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;

            // Calculate the sum of the subarray starting at index 'i'
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }

            // If the sum matches 'd', increment the count
            if (sum == d) {
                count++;
            }
        }

        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(Integer.parseInt(sItems[i]));
        }

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);

        int result = Result.birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
