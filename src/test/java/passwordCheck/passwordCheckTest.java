package passwordCheck;

import com.tasks.passwordCheck.PasswordCheck;
import org.junit.Assert;
import org.junit.Test;

public class passwordCheckTest {
    @Test
    public void testValidPass() {
        String pass = "yQkfk6_yg!";
        Assert.assertTrue(PasswordCheck.passwordCheck(pass));
    }

    @Test
    public void testPassWithNoSpecChar() {
        String pass = "Ffhfh122!";
        Assert.assertFalse(PasswordCheck.passwordCheck(pass));
    }

    @Test
    public void testPassWithNoNum() {
        String pass = "FHFJ_dddds";
        Assert.assertFalse(PasswordCheck.passwordCheck(pass));
    }

    @Test
    public void testShortPass() {
        String pass = "F_d2fS";
        Assert.assertFalse(PasswordCheck.passwordCheck(pass));
    }

    @Test
    public void testEmptyPass() {
        String pass = " ";
        Assert.assertFalse(PasswordCheck.passwordCheck(pass));
    }
}
