import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
     
     // Function to calculate GCD of two numbers
     private static int gcd(int a, int b){
         if(b == 0){
             return a;
         }
         return gcd(b, a % b);
     }
     
     // Function to calculate LCM of two numbers
     private static int lcm(int a, int b){
         return (a * b) / gcd(a, b);
     }
     
     // Function to calculate LCM of an array
     private static int lcmArray(List<Integer> a){
         int result = a.get(0);
         for(int i = 1; i < a.size(); i++){
             result = lcm(result, a.get(i));
         }
         return result;
     }
     
     // Function to calculate GCD of an array
     private static int gcdArray(List<Integer> b){
         int result  = b.get(0);
         for(int i = 1; i < b.size(); i++){
             result = gcd(result, b.get(i));
         }
         return result;
     }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Calculate LCM of array `a`
        int lcmResult = lcmArray(a);
        
        // Calculate GCD of array `b`
        int gcdResult = gcdArray(b);
        
        // Count how many multiples of LCM divide the GCD
        int totalX = 0;
        for(int i = lcmResult; i <= gcdResult; i += lcmResult){
            if(gcdResult % i == 0){
                totalX++;
            }
        }
        
        return totalX;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.getTotalX(a, b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
