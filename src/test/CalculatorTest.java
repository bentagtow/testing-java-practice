import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero(){
        Calculator calculator = new Calculator();

        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());

    }

    @Test
    public void testSettingAccumulatorValue(){
        Calculator calculator = new Calculator();
        BigDecimal value = new BigDecimal(23);
        calculator.setAccumulator(value);
        assertEquals(value, calculator.getAccumulator());
    }
}
