public class VoidMethod {
    public static void main(String args[]){
        String name = null;
        greet( name); String john = "John";
        greet( name); String sam = "Sam";
        greet( name); String raj = "Raj";
        greet( name); String lurky = "Lurky";

    }
    //Method that returns empty value
    public static void greet(String name){
        System.out.println(String.format("hello, %s", name));
    }
}
