package VSlidingWindow;
//variable sliding window dung 1 con tro de duyeet
//tuong tu nhu two pointer 
import java.util.*;
public class Easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int X=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();

        }
        int sum=0;
        int maxlen=0;
        int left=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(sum>X){
                sum-=arr[left];
                left++;
            }
            int len=right-left+1;
            if(len>maxlen){
                maxlen=len;
            }
        }System.out.println(maxlen);

    }
}
