import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;

        // Calculate the sum of all elements in the list
        for (long ele : ar) {
            sum += ele;
        }

        return sum; // Return the total sum
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Read the input and convert it to a list of Long
        List<Long> ar = Arrays.stream(bufferedReader.readLine().trim().split(" "))
            .map(Long::parseLong)
            .collect(Collectors.toList());

        long result = Result.aVeryBigSum(ar);

        // Print the result
        System.out.println(result);

        bufferedReader.close();
    }
}
