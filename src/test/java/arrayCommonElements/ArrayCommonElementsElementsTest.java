package arrayCommonElements;

import com.tasks.arrayCommon.ArrayCommonElements;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCommonElementsElementsTest {
    @Test
    public void testArrayCommonElements(){
        String [] a = {"3","6","9","2","7","23","21","66","0"};
        String [] b = {"5","7","66","3","99","64","2","23"};
        String commonEl = "[3, 2, 7, 23, 66]";
      Assert.assertEquals(commonEl, ArrayCommonElements.commonElements1(a,b));
        String [] c = {" "};
        String [] d = {"5","7","66","3","99","64","2","23"};
        String commonEl1 = "[]";
        Assert.assertEquals(commonEl1, ArrayCommonElements.commonElements1(c,d));
    }


}
