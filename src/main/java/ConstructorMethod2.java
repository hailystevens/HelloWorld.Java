
class Customer {
    //Constructor method
    public Customer() {
        System.out.println("Welcome to Walmart");
    }
    //Instance method to get customer name
    public void getName(String name){
        System.out.println("Customer name is: " + name);
    }
}
public class ConstructorMethod2 {
    public static void main(String[] args){
        Customer customer1 = new Customer(); //Create object from customer class
        customer1.getName("Danny"); //Get name for customer1
        Customer customer2 = new Customer(); //Create object from customer class
        customer2.getName("Deena"); //Get name for customer2
    }
}
