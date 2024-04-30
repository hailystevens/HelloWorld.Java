
class Vehicle{
    String make;
    String model;
    int year;

    //Constructor with parameters
    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    //Starting
    public void start(){
        System.out.println("Starting");
    }
}
public class ConstructorMethodWithParameters {
    public static void main(String[] args){
    }

    public static void main(String[] args, String make, Object model, int year) {
        //Create ford object
        Vehicle ford = new Vehicle(make= "Ford", (String) (model= "Taurus"), year= 2012);
        //Starting
        ford.start();
    }
}
