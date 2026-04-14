package prefixSum;
import java.util.*;
public class pivot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []pre=new int [n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=arr[i]+pre[i-1];
        }
        int count=0;
      int sumleft=0;
      int sumright=0;
      for(int i=0;i<n;i++){
if(i==0)sumleft=0;
else sumleft=pre[i-1];
sumright=pre[n-1]-pre[i];
if(sumleft==2*sumright){
    System.out.println(i);
}
      }
    }
}
