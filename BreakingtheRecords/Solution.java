import java.util.*;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> ans = new ArrayList<>();
        int minAns = 0, maxAns = 0;
        
        // Initialize the first score as both minimum and maximum
        int min = scores.get(0);
        int max = scores.get(0);
        
        // Traverse through the scores starting from the second game
        for (int i = 1; i < scores.size(); i++) {
            int temp = scores.get(i);
            
            // Check if the current score is a new minimum (breaks the worst record)
            if (temp < min) {
                min = temp;
                minAns++;
            }
            
            // Check if the current score is a new maximum (breaks the best record)
            if (temp > max) {
                max = temp;
                maxAns++;
            }
        }
        
        // Add the count of best and worst record breaks
        ans.add(maxAns);
        ans.add(minAns);
        
        return ans;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
