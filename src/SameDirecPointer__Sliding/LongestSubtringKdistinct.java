package SameDirecPointer__Sliding;
import java.util.*;
public class LongestSubtringKdistinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
int[]count=new int[256];
int distinct=0;
int left=0;
int max=Integer.MIN_VALUE;
for(int right=0;right<s.length();right++){
if(count[s.charAt(right)]==0){
   
    distinct++; 
   
} count[s.charAt(right)]++;
while(distinct>k){

count[s.charAt(left)]--;

if(count[s.charAt(left)]==0){
    distinct--;
}left++;

}
int len=right-left+1;
if(len>max){
    max=len;
}
}
System.out.println(max);
    }
}
