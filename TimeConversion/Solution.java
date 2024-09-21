import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        StringBuilder ans = new StringBuilder();
        
        String period = s.substring(s.length() - 2); // AM or PM
        int hours = Integer.parseInt(s.substring(0, 2)); // Extracting hours

        // Handle PM case
        if (period.equals("PM")) {
            if (hours != 12) {
                hours += 12; // Convert to 24-hour format
            }
        } else { // Handle AM case
            if (hours == 12) {
                hours = 0; // Midnight case
            }
        }
        
        // Append formatted hour (with leading zero if necessary)
        ans.append(String.format("%02d", hours));
        
        // Append the rest of the time (minutes and seconds)
        ans.append(s.substring(2, s.length() - 2));
        
        return ans.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the time input
        String s = bufferedReader.readLine();

        // Convert and get the result
        String result = Result.timeConversion(s);

        // Print the result
        System.out.println(result);

        bufferedReader.close();
    }
}
