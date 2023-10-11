import java.util.Scanner;

public class romanToInt {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);

	}
    // Function to convert a Roman numeral to an integer
    public static int romanToInteger(String s) {
        // Roman number to intergers
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int result = 0;
        int i = 0;

        while (i < s.length()) {
            for (int j = 0; j < symbols.length; j++) {
                if (s.startsWith(symbols[j], i)) {
                    result += values[j];
                    i += symbols[j].length();
                    break;
                }
            }
        }

        return result;
    }
}
