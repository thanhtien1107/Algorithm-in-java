package Slidingwindow;

import java.util.*;

public class Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int X=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (i >= k) {
                sum -= arr[i - k];
            }
            if (i >= k - 1) {
            if(sum>=X){
               System.out.println(i-k);
               break;
            }
            }
        }
    }
}
