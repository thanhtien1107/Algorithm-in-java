package prefixSum;
//tinh tổng đoạn từ  l đến r
import java.util.*;
public class Easy {
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
        int left=sc.nextInt();
        int right=sc.nextInt();
        int sum=0;
        if(left==0)sum=pre[right];
        else sum=pre[right]-pre[left-1];
        System.out.println(sum);
    }
}
