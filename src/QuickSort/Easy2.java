package QuickSort;

import java.util.Scanner;

public class Easy2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
           sb.append(arr[i]).append("\n");
        }
        System.out.println(sb.toString()) ;
    }
    public static void quickSort(int[]arr,int start,int end){
        if(end<start){
            int mid=partition(arr,start,end);
            quickSort(arr, start,mid);
quickSort(arr,mid+1,end);

        }
    }
public static int partition(int[]arr,int start,int end){
    int pivot=medianOfThree(arr, start, end);
    int i=start-1;
    int j=end+1;
    while(true){
        do { 
            i++;
        } while (arr[i]<pivot);
        do { 
            j--;
        } while (arr[j]>pivot);
        if(i>=j){
            return j;

        }
        swap(arr,i,j);
    }
}
    public static int medianOfThree(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        if (arr[start] > arr[mid]) {
            swap(arr, start, mid);
        }
        if (arr[start] > arr[end]) {
            swap(arr, start, end);
        }
        if (arr[mid] > arr[end]) {
            swap(arr, mid, end);
        }
        return arr[mid];
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
