package OppositePointer;
import java.util.*;
public class sumcloset {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int target=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){ 
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int left=0;
    int right=n-1;
    int mindiff=Integer.MAX_VALUE;
    int sum=0;
    int l=-1;
    int r=-1;
    while(left<right){
        sum=arr[left]+arr[right];
        int diff=Math.abs(sum-target);
        if(diff<mindiff){
            mindiff=diff;
            l=left;
            r=right;

        }
        if(sum>target){
            right--;
        }else left++;
    }System.out.println(l+" "+r);
   } 
}
