import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Aysun","Akkoyun"));
        customers.add(new Customer(2,"Aynur","Akkoyun"));
        customers.add(new Customer(3,"Ayhan","Akkoyun"));

        for (Customer customer:customers){
            System.out.println(customer.firstname);
        }
    }
}
