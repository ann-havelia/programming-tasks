package arrayCommonElements;

import com.tasks.arrayCommon.ArrayCommonElements;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCommonElementsElementsTest {
    @Test
    public void testArrayCommonElements(){
        String [] a = {"3","6","9","2","7","23","21","66","0"};
        String [] b = {"5","7","66","3","99","64","2","23"};
        String expected = "[3, 2, 7, 23, 66]";
      Assert.assertEquals(expected, ArrayCommonElements.commonElementsManual(a,b));
      Assert.assertEquals(expected, ArrayCommonElements.commonElementsFunction(a,b));

    }
    @Test
    public void testOneArrayIsEmpty(){
        String [] a = {" "};
        String [] b = {"5","7","66","3","99","64","2","23"};
        String expected = "[]";
        Assert.assertEquals(expected, ArrayCommonElements.commonElementsManual(a,b));
        Assert.assertEquals(expected, ArrayCommonElements.commonElementsFunction(a,b));
    }
    @Test
    public void testBothArraysEmpty(){
        String [] a = {" "};
        String [] b = {" "};
        String expected = "[ ]";
        Assert.assertEquals(expected, ArrayCommonElements.commonElementsManual(a,b));
        Assert.assertEquals(expected, ArrayCommonElements.commonElementsFunction(a,b));
    }

}
