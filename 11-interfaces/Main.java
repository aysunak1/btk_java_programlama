public class Main {
    public static void main(String[] args) {
        CustomerManger customerManger= new CustomerManger();
        customerManger.iCustomerDal = new MySqlCustomerDal();
        customerManger.add();


    }
}
