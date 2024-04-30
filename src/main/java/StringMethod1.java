public class StringMethod1 {
    public static void maiin(String args[]){
        String str1 = "Hello Students" + "Welcome to Java World";
        String str2 = "Welcome";
        String str3 = "";
        System.out.println(str1.length()); //Find length of the string
        System.out.println(str1.substring(1)); //Return string after 1 index
        System.out.println(str1.substring(6,13));
        System.out.println(str1.contains("Hello")); //Returns true if str1 contains hello
        System.out.println(str2.equals("Welcome")); //Returns true/false if str2 equals hello
        //Returns true/false if str2 equals hello ignoring uppercase/lowercase characters
        System.out.println(str2.equalsIgnoreCase("Welcome"));
        System.out.println(str3.isEmpty()); //Returns true if str3 is empty
    }
}
