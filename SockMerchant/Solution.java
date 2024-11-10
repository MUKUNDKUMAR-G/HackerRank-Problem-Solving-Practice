import java.util.Scanner;
import java.util.HashSet;

public class Solution{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(sockMerchant(arr));
    }

    private static int sockMerchant(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int pairs = 0;
        for(int sock : arr){
            if(set.contains(sock)){
                pairs++;

                set.remove(sock);
            }else{
                set.add(sock);
            }
        }

        return pairs;
    }
}