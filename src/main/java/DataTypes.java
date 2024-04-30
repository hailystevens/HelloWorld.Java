public class DataTypes {
    public static void main(String[] args) {
        byte b1 = 21;                   //byte datatype
        short shortNumber = 241;        //short datatype
        int i1 = 25;                    //int datatype
        long longNumber = 1313;         //long datatype
        double balance = 241.24;        //double datatype
        float floatingNumber = 241.3f;  //floating datatype
        boolean bool1 = true;           //boolean datatype
        char char1 = 'A';               //char datatype

        System.out.println("Byte number is: " + b1);
        System.out.println("Short number is: " + shortNumber);
        System.out.println("Int number is: " + i1);
        System.out.println("Long number " + longNumber);
        System.out.println("Double value is " + balance);
        System.out.println("Float value is " + floatingNumber);
        System.out.println("Boolean value is " + bool1);
        System.out.println("Char value is " + char1);
    }
}

//PRIMITIVE DATA TYPES
//Java have basically 8 primitive datatypes vvv
//BYTE- the byte data type is an 8 byte signed two's complement integer.
// It ranges -128, 127. Can be useful for saving memory in large arrays, where memory saving actually matters.
//SHORT- 16 bit. -32,768, 32,767
//INT- ranges from -2^31, 2^31-1. usually for arithmetic operations
//LONG- 64 b bit. ranges from -2^63, 2^63-1
//FLOAT. 32 bit. use a float instead of double if you need to save memory
//DOUBLE- 64 bit floating bit. for decimal values
//BOOLEAN- true/false
//CHAR- 16 bit. always 1 character in single quotes