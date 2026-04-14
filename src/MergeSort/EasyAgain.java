package MergeSort;
import java.util.*;
public class EasyAgain {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){ 
    arr[i]=sc.nextInt();
}
int start=0;
int end=n-1;
mergeSort(arr,start,end);
for(int i=0;i<n;i++){
    System.out.println(arr[i]);
}
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int left = mid - start + 1;
        int right = end - mid;
        int[] arrleft = new int[left];
        int[] arrright = new int[right];
        for (int i = 0; i < left; i++) {
            arrleft[i] = arr[start + i];
        }
        for (int i = 0; i < right; i++) {
            arrright[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = start;
        while (i < left && j < right) {
            if (arrleft[i] < arrright[j]) {
                arr[k++] = arrleft[i++];
            } else
                arr[k++] = arrright[j++];
        }
        while (i < left) {
            arr[k++] = arrleft[i++];

        }
        while (j < right) {
            arr[k++] = arrright[j++];
        }
    }
}