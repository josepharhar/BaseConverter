import java.util.Stack;

public class BaseConverter {
    
    public static void main(String[] args) {
        System.out.println(convertToBaseTen('9'));
        System.out.println(convertToBaseTen('a'));
    }
    
    public static void changeBase(int baseTen, int newBase) {
        Stack<Integer> charStack = new Stack<Integer>();
    }
    
    private static char getChar(int number) {
        if (number < 10) {
            return (char) (0x30 + number);
        }
        return (char) (0x61 - 10 + number);
    }
    
    private static int convertToBaseTen(char input) {
        input = Character.toUpperCase(input);
        if (Character.isDigit(input)) {
            return (int) (input - 0x30);
        }
        return (int) (input - 0x37);
    }
}
