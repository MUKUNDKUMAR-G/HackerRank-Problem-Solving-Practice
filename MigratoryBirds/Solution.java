import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> birdFrequency = new HashMap<>();
        int maxFrequency = 0;
        int resultBirdID = Integer.MAX_VALUE;
        
        // Count frequency of each bird ID
        for (int birdID : arr) {
            birdFrequency.put(birdID, birdFrequency.getOrDefault(birdID, 0) + 1);
        }
        
        // Find the bird with the highest frequency and smallest ID
        for (Map.Entry<Integer, Integer> entry : birdFrequency.entrySet()) {
            int birdID = entry.getKey();
            int frequency = entry.getValue();
            
            // Update if we find a higher frequency or same frequency with smaller ID
            if (frequency > maxFrequency || (frequency == maxFrequency && birdID < resultBirdID)) {
                maxFrequency = frequency;
                resultBirdID = birdID;
            }
        }
        
        return resultBirdID;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
