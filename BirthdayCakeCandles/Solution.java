import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */
    
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Collections.max(candles); // Find the maximum candle height
        int count = 0;

        // Count how many candles have the maximum height
        for (int candle : candles) {
            if (candle == max) {
                count++;
            }
        }

        return count; // Return the count of the tallest candles
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.birthdayCakeCandles(candles);

        System.out.println(result);

        bufferedReader.close();
    }
}
