package arrayMinMax;

import com.tasks.arrayMinMax.ArrayMax;
import org.junit.Assert;
import org.junit.Test;

public class ArrayMaxTest {
    @Test
    public void testArrayMax() {
        int[] testArray = {2, 3, 18, 5};
        Assert.assertEquals(18, ArrayMax.maxNumberWithFunc(testArray));
        Assert.assertEquals(18, ArrayMax.maxNumberWithLoop(testArray));
    }

    @Test
    public void testArrayMaxOneValue() {
        int[] testArray = {18};
        Assert.assertEquals(18, ArrayMax.maxNumberWithFunc(testArray));
        Assert.assertEquals(18, ArrayMax.maxNumberWithLoop(testArray));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArrayMaxFunc() {
        int[] testArray = {};
        ArrayMax.maxNumberWithFunc(testArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArrayMaxLoop() {
        int[] testArray = {};
        ArrayMax.maxNumberWithLoop(testArray);
    }
}