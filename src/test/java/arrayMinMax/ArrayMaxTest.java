package arrayMinMax;

import com.tasks.arrayMinMax.ArrayMax;
import org.junit.Assert;
import org.junit.Test;

public class ArrayMaxTest {
    @Test
    public void testArrayMax(){
        String [] str = {"2","3","6","5"};
        Assert.assertEquals(6, ArrayMax.maxNumber1(str));
        Assert.assertEquals(6, ArrayMax.maxNumber2(str));
        String [] str1 = {"1"};
        Assert.assertEquals(1,ArrayMax.maxNumber1(str1));
        Assert.assertEquals(1,ArrayMax.maxNumber2(str1));

    }
}
