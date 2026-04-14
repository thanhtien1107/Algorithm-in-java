package SameDirecPointer__Sliding;
import java.util.*;
public class longestsubwithnorepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int[]count=new int[256];
        int left=0;
        int maxlen=Integer.MIN_VALUE;
        for(int right=0;right<n.length();right++){ 
           count[n.charAt(right)]++;
           while(count[n.charAt(right)]>1){
            count[n.charAt(left)]--;
            left++;
           }
           int len=right-left+1;
           if(len>maxlen){
            maxlen=len;
           }
        }System.out.println(maxlen);

    }
}
