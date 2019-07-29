package pulseCalculator;

import com.tasks.pulseCalculator.PulseCalculator;
import org.junit.Assert;
import org.junit.Test;

public class PulseCalculatorTest {
    @Test
    public void pulseCalculatorTest() {
        int age = 28;
        int pulse = 85;
        int maxHR = PulseCalculator.getMaxHR(age);
        int targetHR = PulseCalculator.getTargetHR(maxHR, pulse);

        long[] result = {139, 149, 160, 171, 181};
        Assert.assertArrayEquals(result, PulseCalculator.getActivityZones(targetHR, pulse));
    }
}
