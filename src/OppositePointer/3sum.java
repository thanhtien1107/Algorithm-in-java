package OppositePointer;
import java.util.*;
public class 3sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int[]arr=new int[n];
int target=sc.nextInt();
for(int i=0;i<n;i++){ 
    arr[i]=sc.nextInt();
}
Arrays.sort(arr);


for(int i=0;i<n-2;i++){
     int left=i+1;
     int right=n-1;
     int sum=0;
     while(left<right){
    sum=arr[i]+arr[left]+arr[right];
    if(sum==target){

        System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                left++;
        right--;
        while(left<right&&arr[left]==arr[left-1]){//xu li truong hop left tiep theo trung
            left++;
        }
        while(left<right&&arr[right]==arr[right+1]){//xu li truong hop right tiep theo trung
            right--;
        }
       
       
    }else if(sum>target){
        right--;
    }else left++;
}
}

}
}
