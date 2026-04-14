package BinarySearch;

import java.util.*;
public class countlengthquerry {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int querry=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
while(querry-->0){
    int target=sc.nextInt();
    int high=n-1;
    int low=0;
    int res=-1;
    int mid=0;
    int count=0;
    while(low<=high){
        mid=low+(high-low)/2;
        if(arr[mid]==target){
            res=mid;
            break;
        }else if(arr[mid]>target){
            high=mid-1;
        }else low=mid+1;
    }
    if(res==-1){
        System.out.println(0);
        continue;
    }
    int last=res;
    while(last<n-1&&arr[last+1]==target){
        last++;
    }
    int first=res;
    while(first>0&&arr[first-1]==target){
        first--;
    }
    count=last-first+1;
    System.out.println(count);
}
}
}