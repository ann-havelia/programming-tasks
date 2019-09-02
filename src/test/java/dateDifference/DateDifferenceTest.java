package dateDifference;

import com.tasks.dateDifference.DateDifference;
import org.junit.Assert;
import org.junit.Test;

public class DateDifferenceTest {
    @Test
    public void testDateDifference() {
        String date1 = "13.01.2017";
        String date2 = "17.03.2017";
        Assert.assertEquals(63, DateDifference.dateDifference(date1, date2));
    }

    @Test
    public void testEmptyDateDifference() {
        String date1 = " ";
        String date2 = " ";
        Assert.assertEquals(0, DateDifference.dateDifference(date1, date2));
    }
}

