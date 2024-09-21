import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
        // Initialize counts for positive, negative, and zero values
        double pos = 0, zero = 0, neg = 0;
        int n = arr.size();  // Get the size of the array
        
        // Loop through the array to count positives, negatives, and zeros
        for (int ele : arr) {
            if (ele > 0) {
                pos++;  // Increment positive counter
            } else if (ele < 0) {
                neg++;  // Increment negative counter
            } else {
                zero++;  // Increment zero counter
            }
        }
        
        // Print the proportions formatted to 6 decimal places
        System.out.printf("%.6f\n%.6f\n%.6f", (pos / n), (neg / n), (zero / n));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the input size
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Read the array of integers
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        // Call the function to calculate and print ratios
        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
