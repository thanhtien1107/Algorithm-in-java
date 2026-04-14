package BinarySearch;
import java.io.*;
import java.util.*;

class Easy {
    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        StringBuilder sb=new StringBuilder();
        int n = sc.nextInt();
        int querry = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        while (querry-- > 0) {
            int target = sc.nextInt();
            int res = -1;
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (arr[mid] == target) {
                   while(mid>0&&arr[mid-1]==target){
                    mid--;
                   }res=mid;
                   break;
                   
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }

            sb.append(res).append(" ");
        }System.out.print(sb);
    }

    static class InputReader {

        StringTokenizer tokenizer;
        BufferedReader reader;
        String token;
        String temp;

        public InputReader(InputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public InputReader(FileInputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    if (temp != null) {
                        tokenizer = new StringTokenizer(temp);
                        temp = null;
                    } else {
                        tokenizer = new StringTokenizer(reader.readLine());
                    }
                } catch (IOException e) {
                }
            }
            return tokenizer.nextToken();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

}
