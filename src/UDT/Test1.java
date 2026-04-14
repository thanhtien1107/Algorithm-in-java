package UDT;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Map<String, Customer> map = new HashMap<>();
        int noOrders = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < noOrders; i++) {
            String id = sc.next();
            long price = sc.nextLong();
            long quantity = sc.nextLong();
            Customer st = map.getOrDefault(id, new Customer(id));
            st.getTotal(quantity, price);
            map.put(id, st);
        }List<Customer>list=new ArrayList<>(map.values());
        list.sort((s1,s2)->{
            int cmp=Long.compare(s2.total, s1.total);
            if(cmp==0){
                cmp=s1.id.compareTo(s2.id);
            }return cmp;
        });
        //lay het
        long getFinal=list.get(k-1).total;
        for(Customer x:list){
            if(x.total>=getFinal){
                sb.append(x.id).append(" ").append(x.total).append("\n");
            }
        }System.out.println(sb);
    }

    public static class Customer {
        String id;
        long total;

        public Customer(String id) {
            this.id = id;
        }

        public long getTotal(long quantity, long price) {
            return this.total+=quantity * price;
        }
    }
}
