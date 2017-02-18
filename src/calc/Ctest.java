package calc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class Ctest  {

	@Test
	public void Ctest() {
		JUnitCore test= new JUnitCore();
		CalculatorModel obj = new CalculatorModel();
		 obj.addTwoNumbers(5,6);
		int res=obj.getCalculationValue();
		
	}

}
