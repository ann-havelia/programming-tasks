package palindrome;

import com.tasks.palindrome.Palindrome;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testPalindrome() {
        String word = "kofok";
        Assert.assertTrue(Palindrome.palindromeCheck(word));
    }

    @Test
    public void testNotPalindrome() {
        String word = "robot";
        Assert.assertFalse(Palindrome.palindromeCheck(word));
    }

    @Test
    public void testPalindromeIgnoreCase() {
        String word = "ggggGGgg";
        Assert.assertTrue(Palindrome.palindromeCheck(word));
    }

    @Test
    public void testPalindromenumbers() {
        String numbers = "0120210";
        Assert.assertTrue(Palindrome.palindromeCheck(numbers));
    }

    @Test
    public void testPalindromeChar() {
        String letter = "v";
        Assert.assertTrue(Palindrome.palindromeCheck(letter));
    }

    @Test
    public void testEmpty() {
        String empty = " ";
        Assert.assertTrue(Palindrome.palindromeCheck(empty));
    }
}
