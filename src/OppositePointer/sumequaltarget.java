package OppositePointer;
import java.util.*;
public class sumequaltarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
int target=sc.nextInt();
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();

}Arrays.sort(arr);
int l=-1;
int r=-1;
int left=0;
int right=n-1;
int sum=0;
while(left<right){
sum=arr[left]+arr[right];
if(sum==target){

   l=left;
   r=right;
 break;  
}
else if(sum>target){
    right--;
}else left++;
}
System.out.println(l+" "+r);
    }
}
