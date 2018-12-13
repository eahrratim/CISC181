package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class RetirementTest {

	@Test
	public void AmountSaveMonthlyTest() {
		Retirement object = new Retirement(40,7,20,2,10000,2642);
		assertEquals(554.13, object.AmountToSave(), 0.01);
		
	}
	@Test 
	public void TotalAmountSavedTest() {
		Retirement object = new Retirement(40,7,20,2,10000,2642);
		assertEquals(1454485.55, object.TotalAmountSaved(), .01);

	}

}
