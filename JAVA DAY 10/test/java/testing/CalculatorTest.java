package testing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calc = new Calculator();
        Assert.assertEquals(5, calc.add(2,3));
    }

}