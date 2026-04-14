package BinarySearch;

import java.util.*;

public class firstOcurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int querry = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        while (querry-- > 0) {
            int high = n - 1;
            int low = 0;
            int res = -1;
            
                            int target = sc.nextInt();

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    while (mid > 0 && arr[mid - 1] == target) {
                        mid--;
                      
                    }
                    res = mid;
                    break;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else
                    high = mid - 1;

            }System.out.println(res);

        }
    }
}