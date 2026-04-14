package SameDirecPointer__Sliding;
import java.util.*;
public class LongestSubsumK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
arr[i]=sc.nextInt();

        }
        int left=0;
        int sum=0;
        int maxlen=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            int len=right-left+1;
            if(len>maxlen){
                maxlen=len;
            }
        }System.out.println(maxlen);
    }
}
