package UDT;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       StringBuilder sb=new StringBuilder();
Map<String,Customer>map=new HashMap<>();
       int noOrders=sc.nextInt();
       int k=sc.nextInt();
       for(int i=0;i<noOrders;i++){
        String id=sc.next();
        long quantity=sc.nextLong();
        long price=sc.nextLong();
        Customer cus=map.getOrDefault(id, new Customer(id));
        cus.getTotal(price, quantity);
        map.put(id,cus);
       }List<Customer>list=new ArrayList<>(map.values());
list.sort((s1,s2)->{
    int cmp=Long.compare(s2.total,s1.total);
    if(cmp==0){
        cmp=s1.id.compareTo(s2.id);
    }return cmp;
});
long removeFinal=k<list.size()?list.get(k).total:-1;
for(Customer x:list){
    if(x.total>removeFinal){
        sb.append(x.id).append(" ").append(x.total).append("\n");
    }
}System.out.println(sb);
    }
    public static class Customer{
        String id;
        long total;
        public Customer(String id){
            this.id=id;
        }
        public long getTotal(long price,long quantity){
            return this.total+=price*quantity;
        }
    }
}
