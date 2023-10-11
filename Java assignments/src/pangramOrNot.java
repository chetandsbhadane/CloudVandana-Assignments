import java.util.Scanner;

public class pangramOrNot {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

	}
    // Function to check if a sentence is a pangram
    public static boolean isPangram(String s) {
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
