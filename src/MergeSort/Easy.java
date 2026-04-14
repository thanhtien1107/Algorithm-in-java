package MergeSort;
import java.util.*;
public class Easy {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      StringBuilder sb=new StringBuilder();
      int n=sc.nextInt()  ;
      int[]arr=new int[n];
      for(int i=0;i<n;i++){ 
        arr[i]=sc.nextInt();
      }
    
      mergeSort(arr,0 ,n-1 );
      for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.print(sb.toString()); 
    }
    static void mergeSort(int[]arr,int start,int end){
if(start<end){
    int mid=(start +end)/2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid+1, end);
    merge(arr,start,mid,end);
}
    }
    static void merge(int[]arr,int start,int mid,int end){
        int left=mid-start+1;
        int right=end-mid;
        int[]arrleft=new int[left];
        int[]arrright=new int[right];
        for(int i=0;i<left;i++){
            arrleft[i]=arr[start+i];
        }
        for(int j=0;j<right;j++){
            arrright[j]=arr[mid+1+j];
        }
        int i=0;int j=0;int k=start;
        while(i<left&&j<right){
            if(arrleft[i]<=arrright[j]){
                arr[k++]=arrleft[i++];
            }else arr[k++]=arrright[j++];
        }
        while(i<left)
            arr[k++]=arrleft[i++];
        while(j<right)
            arr[k++]=arrright[j++];
    }
}
