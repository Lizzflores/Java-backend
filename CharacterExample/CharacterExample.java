public class CharacterExample {
    public static void main(String[] args) {
        // Characters (single quotes)
        char character = 'a';
        System.out.println(character);

        character = 65;
        System.out.println(character);

        character = 65 + 1;
        char secondCharacter = (char) (character + 1);
        System.out.println(secondCharacter);

        // Strings (double quotes)
        String word = "Alura online courses";
        System.out.println(word);

        word = word + " 2020";
        System.out.println(word);

        // Example of variable values
        int number1 = 5;
        int number2 = 9;

        System.out.println(number2);

        number2 = number1; // 5
        System.out.println(number2);

        number1 = 88;
        // What is the value of number2?
        System.out.println(number2); // 5
    }
}
