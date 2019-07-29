package arraySum;

import com.tasks.arraySum.ArraySum;
import org.junit.Assert;
import org.junit.Test;

public class ArraySumTest {
    @Test
    public void testArraySum() {
        String[] str = {"2", "3", "6", "5","11"};
        Assert.assertEquals(27, ArraySum.sum1(str));
        Assert.assertEquals(27, ArraySum.sum2(str));
        String[] str1 = {"2"};
        Assert.assertEquals(2, ArraySum.sum1(str1));
        Assert.assertEquals(2, ArraySum.sum2(str1));
    }

}
