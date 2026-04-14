package Slidingwindow;

import java.util.*;

//dem so win size co dung k phan tu khac nhau
public class countdistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] fre = new int[10000000];
        int distinct = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            fre[arr[i]]++;
            if (fre[arr[i]] == 1) {
                distinct++;
            }
            if (i >= k) {
                fre[arr[i - k]]--;
                if (fre[arr[i - k]] == 0) {
                    distinct--;
                }
            }
            if(i>=k-1){
                if(distinct==k){
                    count++;
                }
            }
        }System.out.println(count);
    }
}
