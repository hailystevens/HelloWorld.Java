public class Car {
    String make;
    String model;
    int year;
    //Constructor with parameters
    public Car(String make, String model, int year){
        this.make = make;
        this.model= model;
        this.year = year;
    }
    //Getter methods
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    //Setter methods
    public void setMake(String newMake) {
    this.make = newMake;
    }
    public void setModel(String newModel) {
    this.model = newModel;
    }
    public void setYear(int newYear) {
    this.year = newYear;
    }
    //Starting
    public void start() {
    System.out.println("Starting");
}
public static class AccessorSetterMethod {
    public static void main(String[] args) {
        //Create ford object
        Car toyota = new Car("Toyota", "RAV4", 2015);

        //Use setter methods to set new value
        toyota.setMake("Toyota");
        toyota.setModel("Prius V");
        toyota.setYear(2016);

        //Use getter methods to get the value
        System.out.println(STR."Car make is: \{toyota.getMake()}");
        System.out.println(STR."Car model is: \{toyota.getModel()}");
        System.out.println(STR."Car year is: \{toyota.getYear()}");
        //Starting
        toyota.start();}}}