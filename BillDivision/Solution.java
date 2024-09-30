import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Result {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Step 1: Calculate Anna's actual share
        int total = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                total += bill.get(i);
            }
        }
        int annaShare = total / 2;

        // Step 2: Compare with what Brian charged
        if (annaShare == b) {
            System.out.println("The charged Amount is Correct(Bon Appetit): ");
        } else {
            System.out.println("The Amount to refund to Anna by Brain is " + (b - annaShare)); // Refund amount
        }
    }
}

public class Solution{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Size of array which would consider the bill for each Dish:");
        int n = input.nextInt();

        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter the dishes cost:");
        for(int i = 0; i < n; i++){
            arr.add(input.nextInt());
        }

        System.out.print("Enter a Integer of index which Anna did not eat(0th base): ");
        int k = input.nextInt();

        System.out.print("Enter the amount That Brain Charged Anna: ");
        int b = input.nextInt();

        Result result = new Result();
        result.bonAppetit(arr, k, b);
    }
}