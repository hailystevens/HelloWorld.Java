public class StaticMathod {
    public static void main(String args[]){
name_of_dog("Max");
bark();
    }
    //Static method that provides name of the dog
public static void name_of_dog(String name){
    System.out.println("My name is: " + name);
    }
    //Static method
    public static void bark(){
        System.out.println("I am barking");
    }
}