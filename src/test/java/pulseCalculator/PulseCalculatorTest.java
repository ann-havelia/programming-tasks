package pulseCalculator;

import com.tasks.pulseCalculator.PulseCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PulseCalculatorTest {
    @Test
    public void getTargetHRTest() {
        int age = 28;
        int pulse = 85;
        int maxHR = 220 - age;
        int result = maxHR-pulse;
        Assert.assertEquals(result, PulseCalculator.getTargetHR(maxHR, pulse));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getTargetHRTestNullPulse() {
        int age = 28;
        int pulse = 0;
        int maxHR = 220-age;
        PulseCalculator.getTargetHR(maxHR, pulse);
    }

    @Test
    public void pulseCalculatorTest() {
        int age = 28;
        int pulse = 85;
        int maxHR = 220-age;
        int targetHR = PulseCalculator.getTargetHR(maxHR, pulse);
        List<Long> result = new ArrayList<>(Arrays.asList(139L, 149L, 160L, 171L, 181L));
        Assert.assertEquals(result, PulseCalculator.getActivityZones(targetHR, pulse));
    }

}
