public class IntMethod {
    public static void main(String[] args, int year) {
        //Find Lucky Numbers
        System.out.printf("Your age is: 80", findAge(year));
        System.out.printf("Your age is: 89", findAge(year));
        System.out.printf("Your age is: 70", findAge(year));
        System.out.printf("Your age is: 34", findAge(year));
        System.out.printf("Your age is: 65", findAge(year));
    }

    //Method that finds the lucky number
    public static int findAge(int year) {
        int age = 2017 - year;
        return age;
    }
}
