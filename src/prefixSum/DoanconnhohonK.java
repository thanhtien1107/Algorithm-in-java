package prefixSum;

//dem so doan con nho hon k
import java.util.*;

public class DoanconnhohonK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
int k=sc.nextInt();
for(int i=0;i<n;i++){ 
    arr[i]=sc.nextInt();
}

int sum=0;
int count=0;
int left=0;

for(int right=0;right<n;right++){
sum+=arr[right];
while(sum>k){
    sum-=arr[left];
left++;
}if(sum<=k){
    count+=right-left+1;
}



}
System.out.println(count);}}