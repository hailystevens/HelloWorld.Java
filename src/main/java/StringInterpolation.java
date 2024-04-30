public class StringInterpolation {
    public static void main(String args[]){
        String custName = "Kevin";
        int age = 45;
        String streetName = "4131 California Avenue";
        String city = "Los Angeles";
        String state= "California";
        String country = "USA";
        String zipCode = "90012";

        //No string interpolation
        System.out.println(String.format(("Student Details: name: %s, age: %d, Address: %s, City: %s, State: %s") +
                "Country: %s, ZipCode: %s", custName, age, streetName, city, state, country, zipCode));
    }
}
