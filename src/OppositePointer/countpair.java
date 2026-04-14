package OppositePointer;
import java.util.*;
public class countpair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();

        }Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int count=0;
 int sum=0;
        while(left<right){
sum=arr[left]+arr[right];
if(sum==target){
    count++;
    left++;
    right--;
}else if(sum>target){
    right--;
}else left++;
        }System.out.println(count);

    }
}
