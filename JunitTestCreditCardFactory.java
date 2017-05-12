package creditCard;

import static junit.framework.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
 
public class JunitTestCreditCardFactory extends TestCase {
	CreditCard discover;
	CreditCard mc;
	CreditCard pretend;
	CreditCard visa;
	
	public void testCardCreations() {
		assertNotNull(discover = CreditCardFactory.orderCard(CreditCardType.DISCOVER));
		assertNotNull(mc = CreditCardFactory.orderCard(CreditCardType.MC));
		assertNotNull(pretend = CreditCardFactory.orderCard(CreditCardType.PRETEND));
		assertNotNull(visa = CreditCardFactory.orderCard(CreditCardType.VISA));
		System.out.println("@Test card creations(): Discover card = " + discover.getType().toString() );
		System.out.println("@Test card creations(): MC card = " + mc.getType().toString() );
		System.out.println("@Test card creations(): PRETEND card = " + pretend.getType().toString() );
		System.out.println("@Test card creations(): Visa card = " + visa.getType().toString() );
		assertEquals(discover.getType(), CreditCardType.DISCOVER);
		assertEquals(mc.getType(), CreditCardType.MC);
		assertEquals(pretend.getType(), CreditCardType.PRETEND);
		assertEquals(visa.getType(), CreditCardType.VISA);
    }
 
}
