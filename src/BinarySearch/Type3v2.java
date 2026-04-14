import java.util.*;
public class Type3v2 {
    //agresssive cow
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int C=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){ 
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int left=0;
    int right=arr[n-1]-arr[0];//khoang cach lon nhat
    int ans=0;

    while(left<=right){
        int mid=left+(right-left)/2;
        if(check(arr,mid,C)){
            ans=mid;
            left=mid+1;
        }else right=mid-1;
    }System.out.println(ans);
   } static boolean check(int[]arr,int distance,int C){
    int count=1;//vi tri con bo dau tien
    int last=arr[0]; //vi tri con bo gan nhat
    for(int i=1;i<arr.length;i++){
        if(arr[i]-last>=distance){
            count++;
            last=arr[i];
            if(count>=C)return true;
        }
    }return false;
   }
}
