import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create a deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert all characters into the deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear until deque is empty
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string '" + word + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + word + "' is NOT a Palindrome.");
        }
    }
}