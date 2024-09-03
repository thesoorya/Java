public class typecasting {
    public static void main(String[] args) {

        // Automatic Type Conversion (Widening Conversion)
        // This type of conversion happens automatically when you assign a value of a smaller data type to a larger data type.
        int intValue = 10;
        long longValue = intValue; //int to long
        float floatValue = intValue; //int to float
        double doubleValue = intValue; //int to double

        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
    }
}
