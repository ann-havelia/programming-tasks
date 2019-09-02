package arrayMinMax;

import com.tasks.arrayMinMax.ArrayMin;
import org.junit.Assert;
import org.junit.Test;

public class ArrayMinTest {
    @Test
    public void testArrayMax() {
        int[] testArray = {8, 76, 2, 3, 18, 5};
        Assert.assertEquals(2, ArrayMin.minNumberWithFunc(testArray));
        Assert.assertEquals(2, ArrayMin.minNumberWithLoop(testArray));
    }

    @Test
    public void testArrayMaxOneValue() {
        int[] testArray = {18};
        Assert.assertEquals(18, ArrayMin.minNumberWithFunc(testArray));
        Assert.assertEquals(18, ArrayMin.minNumberWithLoop(testArray));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArrayMaxFunc() {
        int[] testArray = {};
        ArrayMin.minNumberWithFunc(testArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArrayMaxLoop() {
        int[] testArray = {};
        ArrayMin.minNumberWithLoop(testArray);
    }
}