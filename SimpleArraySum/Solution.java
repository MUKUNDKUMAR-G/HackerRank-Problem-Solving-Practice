import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static int simpleArraySum(List<Integer> ar) {
        // Calculate the sum of the elements in the list
        int sum = 0;
        for (int num : ar) {
            sum += num; // Add each element to the sum
        }
        return sum; // Return the total sum
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> ar = Arrays.stream(bufferedReader.readLine().trim().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.simpleArraySum(ar);

        System.out.println(result); // Print the result

        bufferedReader.close();
    }
}
