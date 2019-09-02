package arraySum;

import com.tasks.arraySum.ArraySum;
import org.junit.Assert;
import org.junit.Test;

public class ArraySumTest {
    @Test
    public void testArraySum() {
        int[] array = {2, 3, 6, 5, 11};
        Assert.assertEquals(27, ArraySum.sumManual(array));
        Assert.assertEquals(27, ArraySum.sumFunction(array));
    }

    @Test
    public void testArraySumOneValue() {
        int[] array = {2};
        Assert.assertEquals(2, ArraySum.sumManual(array));
        Assert.assertEquals(2, ArraySum.sumFunction(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArraySumManual() {
        int[] array = {};
        ArraySum.sumManual(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArraySumFunc() {
        int[] array = {};
        ArraySum.sumFunction(array);
    }

}
