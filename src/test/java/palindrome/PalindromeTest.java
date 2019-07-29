package palindrome;

import com.tasks.palindrome.Palindrome;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testPalindrome(){
        String word = "robot";
        Assert.assertFalse(Palindrome.palindromeCheck(word));
        String word1="kofok";
        Assert.assertTrue(Palindrome.palindromeCheck(word1));
        String word2="ggggGGgg";
        Assert.assertTrue(Palindrome.palindromeCheck(word2));
        String num="011110";
        Assert.assertTrue(Palindrome.palindromeCheck(num));
        String letter = "v";
        Assert.assertTrue(Palindrome.palindromeCheck(letter));
        String empty = " ";
        Palindrome.palindromeCheck(empty);
    }


}
