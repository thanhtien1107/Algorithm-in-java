package prefixSum;
import java.util.*;
public class SumSubMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
int[]pre=new int[n];
pre[0]=arr[0];
for(int i=1;i<n;i++){
    pre[i]=pre[i-1]+arr[i];
}
int sum=0;
int max=Integer.MIN_VALUE;
for(int left=0;left<n;left++){
    for(int right=left;right<n;right++){
        if(left==0)sum=pre[right];
    else sum=pre[right]-pre[left-1];
    if(sum>max){
        max=sum;
    }
    }
}System.out.println(max);
    }
}
