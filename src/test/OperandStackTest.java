import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperandStackTest {
    private OperandStack stack;

    @Before
    public void createStack(){
        stack = new OperandStack();
    }
    @Test
    public void testOperandStackPeekReturnsZero(){
        assertEquals(BigDecimal.ZERO, stack.peek());
    }
    
    @Test
    public void testPushingValueOntoStack(){
        BigDecimal value = new BigDecimal(12);
        stack.push(value);
        assertEquals(value, stack.peek());
    }
}
