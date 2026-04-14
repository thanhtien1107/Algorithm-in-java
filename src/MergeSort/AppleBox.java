package MergeSort;

import java.util.Scanner;

public class AppleBox {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int N=sc.nextInt();
            long A=sc.nextLong();
            long P=sc.nextLong();
            int[]arr=new int[N];
             arr[0] = (int) ((A * A) % P);
            for (int i = 1; i < N; i++) {
                arr[i] = (int) ((arr[i - 1] * A) % P);
            }
            System.out.println(mergeSort(arr, 0, N - 1));

        }
    }
    public static long mergeSort(int[]arr,int start,int end){
        long count=0;
        if(start<end){
            int mid=start+(end-start)/2;
          count+=  mergeSort(arr,start,mid);
            count+=mergeSort(arr,mid+1,end);
           count+= merge(arr,start,mid,end);

        }return count;
    }
    public static long merge(int[]arr,int start,int mid,int end){
        int left=mid-start+1;
        int right=end-mid;
        int[]arrleft=new int[left];
        int[]arrright=new int[right];
        for(int i=0;i<left;i++){
            arrleft[i]=arr[start+i];

        }
        for(int i=0;i<right;i++){
            arrright[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=start;
        long count=0;
        while(i<left&&j<right){
            if(arrleft[i]<arrright[j]){
                arr[k++]=arrleft[i++];
            }else{
                arr[k++]=arrright[j++];
                count+=left-i;
            }
        }while(i<left){
            arr[k++]=arrleft[i++];
        }while(j<right){
            arr[k++]=arrright[j++];
        }return count;
    }
}
