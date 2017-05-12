package creditCard;
 
public class CreditCardFactory {
    public static CreditCard orderCard(CreditCardType cardType) {
        CreditCard card = new CreditCard(cardType);
        switch (cardType) {
        case DISCOVER:
			card.setInterest(0.01);
            break;
 
        case MC:
 			card.setInterest(0.05);
            break;
 
        case VISA:
			card.setInterest(0.10);
            break;
			
		case PRETEND:
            System.out.println("Someone forgot their card name!");
            break;
 
        default:
            System.out.println("Something went wrong.  Write some code here to handle it!");
            break;
        }
        return card;
    }
}
