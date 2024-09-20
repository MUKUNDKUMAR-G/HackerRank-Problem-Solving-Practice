import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts the following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        // Compare the ratings
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }

        return Arrays.asList(aliceScore, bobScore); // Return scores as a list
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read Alice's ratings
        List<Integer> a = Arrays.stream(bufferedReader.readLine().trim().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        // Read Bob's ratings
        List<Integer> b = Arrays.stream(bufferedReader.readLine().trim().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> result = Result.compareTriplets(a, b);

        // Print the result
        System.out.println(result.get(0) + " " + result.get(1));

        bufferedReader.close();
    }
}
