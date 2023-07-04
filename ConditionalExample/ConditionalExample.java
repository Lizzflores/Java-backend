public class ConditionalExample {
    public static void main(String[] args) {
        int age = 28;
        int personCount = 2;
        boolean isCouple = personCount > 1;

        // If statement without braces only considers the next line
        if (age >= 18 && isCouple) {
            System.out.println("You are allowed to enter.");
        } else {
            System.out.println("You are not allowed to enter.");
        }

    }
}
