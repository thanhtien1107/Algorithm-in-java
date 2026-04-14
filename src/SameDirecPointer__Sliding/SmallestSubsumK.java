package SameDirecPointer__Sliding;

import java.util.*;

public class SmallestSubsumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int sum = 0;
        int min = n;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum >= target) {
                int len = right - left + 1;
                if (len < min) {
                    min = len;
                }
                sum -= arr[left];
                left++;
            }

        }
        System.out.println(min);
    }
}
