package arrayMinMax;

import com.tasks.arrayMinMax.ArrayMax;
import com.tasks.arrayMinMax.ArrayMin;
import org.junit.Assert;
import org.junit.Test;

public class ArrayMinTest {
    @Test
    public void testArrayMin(){
        String [] str = {"5","2","3","6"};
        Assert.assertEquals(2, ArrayMin.minNumber1(str));
        Assert.assertEquals(2, ArrayMin.minNumber2(str));
        String [] str1 = {"145"};
        Assert.assertEquals(145,ArrayMax.maxNumber1(str1));
        Assert.assertEquals(145,ArrayMax.maxNumber2(str1));
    }
}