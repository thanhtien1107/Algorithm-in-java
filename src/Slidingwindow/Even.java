package Slidingwindow;
import java.util.*;
public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)count++;
            if(i>=k){
                if(arr[i-k]%2==0)count--;
            }
            if(i>=k-1){
                if(count>max){
                    max=count;
                }
            }
        }System.out.println(max);
    }
}
