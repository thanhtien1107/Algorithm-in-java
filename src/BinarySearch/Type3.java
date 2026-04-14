package BinarySearch;
import java.util.*;
public class Type3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int M=sc.nextInt();
        int[]arr=new int[n];
        int maxheight=0;
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
maxheight=Math.max(maxheight,arr[i]);
        }
        int left=0;int right=maxheight;int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(check(arr,mid,M)){
                ans=mid;
                left=mid+1;
            }else right=mid-1;
        }

System.out.println(ans);
    }
    static boolean check(int[]arr,int H,int M){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>H){
                sum+=arr[i]-H;
            }
        }return sum>=M;
    }
}
