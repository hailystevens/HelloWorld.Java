public class AccessorSetterMethod {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota",  "RAV4", 2015 );
        System.out.println(c1.getMake());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());
        //Set to new value
        c1.setMake("Toyota");
        c1.setModel("Prius V");
        c1.setYear(2016);
        //Get the value again
        System.out.println(c1.getMake());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());
}}
