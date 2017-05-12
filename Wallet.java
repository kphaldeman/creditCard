package creditCard;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Wallet {
	
	private static DecimalFormat df = new DecimalFormat("#.00");
	Map<String,CreditCard> slots = new HashMap<String,CreditCard>();
	
	public void addCard(String name, CreditCard card) {
		slots.put(name, card);
	}
	
	public CreditCard retrieveCard(String name) {
		CreditCard extractedCard;
		extractedCard = slots.get(name);
		
		if (extractedCard == null) {
			// The named card was not in this wallet;  return a Pretend card to let the user know of the error
			extractedCard = CreditCardFactory.orderCard(CreditCardType.PRETEND);
		}
		
		return extractedCard;
	}
	
	public String getBalances() {
		
		StringBuilder retVal = new StringBuilder();
		
		//Traverse map  
	    for (Map.Entry<String,CreditCard> entry:slots.entrySet()) {    
	        String key      = entry.getKey();  
	        CreditCard card = entry.getValue();  
	        retVal.append(key + " has a balance of ");
			retVal.append(df.format(card.getBalance()));
			retVal.append(" and an interest of ");
			retVal.append(df.format(card.calculateFinanceCharge()));
			retVal.append(" % ");
			retVal.append("\r\n");
		}
		
		if (retVal.toString().isEmpty()) {
			retVal.append("You are financially viable!  No credit cards, no debt!");
		}
		
		return retVal.toString();
	}
	
	public double amountOwed() {
		
		double amountOwed = 0.0;
		
		//Traverse map  
		for (Map.Entry<String,CreditCard> entry:slots.entrySet()) {    
	 		CreditCard card = entry.getValue();  
			amountOwed      += card.getBalance() + card.calculateFinanceCharge();
		}
		
		return amountOwed;
	}
}
