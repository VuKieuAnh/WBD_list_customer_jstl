package customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB {
    private static final List<Customer> customers = new ArrayList<Customer>();

    static {
        initData();
    }

    private static void initData(){
        Customer customer1 = new  Customer("VKA1", "11/05/1993", "Hà Nội");
        Customer customer2 = new  Customer("VKA2", "11/05/1993", "Hà Nội");
        Customer customer3 = new  Customer("VKA3", "11/05/1993", "Hà Nội");

        customers.add(customer1);
        customers.add(customer3);
        customers.add(customer2);
    }

    public static List<Customer> queryCustomer() {
        return customers;
    }

}
