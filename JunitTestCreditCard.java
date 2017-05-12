package creditCard;

import static junit.framework.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
 
public class JunitTestCreditCard extends TestCase {
	CreditCard discover;
	CreditCard mc;
	CreditCard pretend;
	CreditCard visa;
	
	public void testCards() {
		assertNotNull(discover = CreditCardFactory.orderCard(CreditCardType.DISCOVER));
		assertNotNull(mc = CreditCardFactory.orderCard(CreditCardType.MC));
		assertNotNull(pretend = CreditCardFactory.orderCard(CreditCardType.PRETEND));
		assertNotNull(visa = CreditCardFactory.orderCard(CreditCardType.VISA));
		System.out.println("@Test cards(): Discover card = " + discover.getType().toString() );
		System.out.println("@Test cards(): Discover card interest rate = " + String.valueOf(discover.getInterest()) +"%" );
		System.out.println("@Test cards(): MC card = " + mc.getType().toString() );
		System.out.println("@Test cards(): MC card interest rate = " + String.valueOf(mc.getInterest()) +"%" );
		System.out.println("@Test cards(): PRETEND card = " + pretend.getType().toString() );
		System.out.println("@Test cards(): PRETEND card interest rate = " + String.valueOf(pretend.getInterest()) +"%" );
		System.out.println("@Test cards(): Visa card = " + visa.getType().toString() );
		System.out.println("@Test cards(): Visa card interest rate = " + String.valueOf(visa.getInterest()) +"%" );
		assertEquals(0.01, discover.getInterest());
		assertEquals(0.05, mc.getInterest());
		assertEquals(0.15, pretend.getInterest());
		assertEquals(0.10, visa.getInterest());
		visa.chargeToCard(110.00);
		assertEquals(visa.getBalance(), 110.00);
		assertEquals(visa.calculateFinanceCharge(), visa.getBalance() * visa.getInterest() );
		visa.payOnCard(10.00);
		assertEquals(visa.getBalance(), 100.00);
		assertEquals(visa.calculateFinanceCharge(), visa.getBalance() * visa.getInterest() );
    }
 
}
