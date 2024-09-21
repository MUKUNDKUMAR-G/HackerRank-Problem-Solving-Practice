import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0);  // Initialize the min with the first element
        long max = arr.get(0);  // Initialize the max with the first element
        long sum = 0;  // Variable to store the total sum
        
        // Loop through the array to find min, max, and calculate sum
        for (long ele : arr) {
            if (ele < min) {
                min = ele;
            }
            if (ele > max) {
                max = ele;
            }
            sum += ele;
        }
        
        // Print the minimum sum (sum of all elements excluding max) 
        // and the maximum sum (sum of all elements excluding min)
        System.out.print((sum - max) + " " + (sum - min));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read input and split it into a list of integers
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        // Call the function to compute the result
        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
