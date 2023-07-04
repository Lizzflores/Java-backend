public class VariableTypes {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        int age = 28;
        System.out.println(age);

        age = 46 + 99;
        System.out.println("My age is: " + age);

        double salary = 1250.56;
        System.out.println(salary);

        int division = 1230 / 3;
        System.out.println(division);

        // Type conversions
        double variable1 = 280.89;
        int variable1Integer = (int) variable1; // Casting

        System.out.println(variable1Integer);

        // Long numbers
        long test = 122222222222222222L;

        // Short numbers
        short smallNumber = 13555;

        // Smallest number (file processing)
        byte tinyNumber = 15;

        // Floating-point number
        float smallDecimalNumber = 2.5F;
    }
}
