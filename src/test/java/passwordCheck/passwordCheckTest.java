package passwordCheck;

import com.tasks.passwordCheck.PasswordCheck;
import org.junit.Assert;
import org.junit.Test;

public class passwordCheckTest {
    @Test
    public void PasswordCheckTest(){
        String pass1 = "yQkfk6_yg!";
        Assert.assertTrue(PasswordCheck.passwordCheck(pass1));
        String pass2="Ffhfh122!";
        Assert.assertFalse(PasswordCheck.passwordCheck(pass2));
        String pass3="FHFJ_dddds";
        Assert.assertFalse(PasswordCheck.passwordCheck(pass3));
        String pass4=" ";
        Assert.assertFalse(PasswordCheck.passwordCheck(pass4));
    }

}
