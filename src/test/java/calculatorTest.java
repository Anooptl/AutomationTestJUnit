import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import CalculatorProject.Calculator;

public class calculatorTest {

	Calculator calc;
	@Before
	public void setUp() {
		 calc = new Calculator();
	}
	@Test
	public void addTwoNumber() {
		assertEquals(20, calc.add(10,10));
	}
	@Test
	public void addThreeNumber() {
		assertEquals(35, calc.add(10,10,15));
	}
	@Test
	public void SubstarctThreeNumber() {
		assertEquals(10, calc.substarct(30,10,10));
	}
	
}
