package programmersDay;

import com.tasks.programmersDay.ProgrammersDay;
import org.junit.Assert;
import org.junit.Test;

public class ProgrammersDayTest {
    @Test
    public void programmersDayTest(){
        int year = 2017;
        int year1 = 2018;
        Assert.assertEquals("Wednesday", ProgrammersDay.returnDay(year));
        Assert.assertEquals("Thursday", ProgrammersDay.returnDay(year1));

    }
}
