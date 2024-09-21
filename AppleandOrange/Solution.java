import java.io.*;
import java.util.*;

public class Solution {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0;
        int orangeCount = 0;

        // Count apples that fall on the house
        for (int apple : apples) {
            if (a + apple >= s && a + apple <= t) {
                appleCount++;
            }
        }

        // Count oranges that fall on the house
        for (int orange : oranges) {
            if (b + orange >= s && b + orange <= t) {
                orangeCount++;
            }
        }

        // Print results
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] st = bufferedReader.readLine().split(" ");
        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);
        String[] ab = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        String[] applesTemp = bufferedReader.readLine().split(" ");
        List<Integer> apples = new ArrayList<>();
        for (String apple : applesTemp) {
            apples.add(Integer.parseInt(apple));
        }
        String[] orangesTemp = bufferedReader.readLine().split(" ");
        List<Integer> oranges = new ArrayList<>();
        for (String orange : orangesTemp) {
            oranges.add(Integer.parseInt(orange));
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
        bufferedReader.close();
    }
}
