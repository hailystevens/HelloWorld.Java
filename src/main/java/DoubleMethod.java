public class DoubleMethod {
    public static void main(String[] args) {
      int number1 = 25;
      int number2 = 245;
      //Variable that stores the addition of two numbers
      double sum = add(number1, number2);
      System.out.println("Sum is: " + sum);
}
//Method that does the addition of two integer numbers
    public static double add(int num1, int num2){
        double total = num1 + num2;
        return total;
    }
}
