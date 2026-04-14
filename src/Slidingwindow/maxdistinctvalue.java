package Slidingwindow;

import java.util.Scanner;

public class maxdistinctvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[]fre=new int[100000];
    int max=Integer.MIN_VALUE;
    int distinct=0;
    for(int i=0;i<n;i++){
        fre[arr[i]]++;
        if(fre[arr[i]]==1)
            distinct++;
        if(i>=k){
            fre[arr[i-k]]--;
            if(fre[arr[i-k]]==0){
                distinct--;
            }
        }
        if(i>=k-1){
            if(distinct>max){
                max=distinct;
            }
        }
    }
    System.out.println(max);
    
    
    
    }
}