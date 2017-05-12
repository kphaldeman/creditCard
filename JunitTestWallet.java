package creditCard;

import static junit.framework.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
import java.text.DecimalFormat;
 
public class JunitTestWallet extends TestCase {
	Wallet markWallet;
	Wallet darrenWallet1;
	Wallet darrenWallet2;
	Wallet carlWallet;
	Wallet kurtWallet;
	CreditCard aCard;
	private static DecimalFormat df = new DecimalFormat("#.00");
	
	public void testCards() {
		assertNotNull(markWallet    = new Wallet());
		assertNotNull(darrenWallet1 = new Wallet());
		assertNotNull(darrenWallet2 = new Wallet());
		assertNotNull(carlWallet    = new Wallet());
		assertNotNull(kurtWallet    = new Wallet());
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.VISA) );
		aCard.chargeToCard(100.00);
		markWallet.addCard("Credit Union Visa", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.MC) );
		aCard.chargeToCard(100.00);
		markWallet.addCard("Citi MC", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.DISCOVER) );
		aCard.chargeToCard(100.00);
		markWallet.addCard("Discover It Miles Card", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.VISA) );
		aCard.chargeToCard(100.00);
		darrenWallet1.addCard("Bank of America Visa", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.DISCOVER) );
		aCard.chargeToCard(100.00);
		darrenWallet1.addCard("Discover It CashBack Card", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.MC) );
		aCard.chargeToCard(100.00);
		darrenWallet2.addCard("Wells Fargo MC", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.VISA) );
		aCard.chargeToCard(100.00);
		carlWallet.addCard("US Bank Visa", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.MC) );
		aCard.chargeToCard(100.00);
		carlWallet.addCard("Bank of the West MC", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.DISCOVER) );
		aCard.chargeToCard(100.00);
		carlWallet.addCard("Discover It Card", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.VISA) );
		aCard.chargeToCard(100.00);
		kurtWallet.addCard("Chase Visa", aCard );
		assertNotNull(aCard = CreditCardFactory.orderCard(CreditCardType.MC) );
		aCard.chargeToCard(100.00);
		kurtWallet.addCard("Capital One MC", aCard );
		System.out.println("@Test wallet:Mark's wallet balance = ");
		System.out.println( markWallet.getBalances() );
		System.out.println("@Test wallet:Mark owes: ");
		System.out.println( "$" + df.format(markWallet.amountOwed()) + "\r\n");
		System.out.println("@Test wallet:Darren's first wallet balance = ");
		System.out.println( darrenWallet1.getBalances() );
		System.out.println("@Test wallet:Darren's second wallet balance = ");
		System.out.println( darrenWallet2.getBalances() );
		System.out.println("@Test wallet:Darren owes: ");
		System.out.println( "$" + df.format((darrenWallet1.amountOwed() + darrenWallet2.amountOwed())) + "\r\n");
		System.out.println("@Test wallet:Carl's wallet balance =");
		System.out.println( carlWallet.getBalances() );
		System.out.println("@Test wallet:Carl owes: ");
		System.out.println( "$" + df.format(carlWallet.amountOwed()) + "\r\n");
		System.out.println("@Test wallet:Kurt's wallet balance = ");
		System.out.println( kurtWallet.getBalances() );
		System.out.println("@Test wallet:Kurt owes: ");
		System.out.println( "$" + df.format(kurtWallet.amountOwed()) );
    }
 
}
