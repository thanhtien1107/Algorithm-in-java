package prefixSum;

public class testthu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       /* int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = arr[i] + pre[i - 1];

        }
        int maxlen = 0;
        int sum = 0;
        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                if (left == 0)
                    sum = pre[right];
                else
                    sum = pre[right] - pre[left - 1];
                if (sum == k) {
                    int len = right - left + 1;
                    if (len > maxlen) {
                        maxlen = len;
                    }
                }
            }
        }
        System.out.println(maxlen);*/




        int left=0;
        int sum=0;
        int maxlen=0;
for(int right=0;right<n;right++){
sum+=arr[right];
while(sum>k){
    sum-=arr[left];
    left++;
}if(sum==k){
    int len=right-left+1;
    if(len>maxlen){
        maxlen=len;
    }
}
    }System.out.println(maxlen);
}
}