
public class Hand {
	private int value;
	private Card[] currentCards;

	
	public Hand()
	{
		this.currentCards=new Card[52];
	}		
	
	public void AddCard(Card A)
	{
		for(int i=0;i<52;i++)
		{
			if(currentCards[i]==null)
			{
				currentCards[i]=new Card(A);
				this.value+=A.getValue();
				return;
			}
		}
	}
	
	public void resetHand()
	{
		for(int i=0;i<52;i++)
		{
			currentCards[i]=null;
			
		}
		value=0;
		
	}
	public Hand(int value, Card[] currentCards) {
		
		this.value = value;
		this.currentCards = currentCards;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Card[] getCurrentCards() {
		return currentCards;
	}
	public void setCurrentCards(Card[] currentCards) {
		this.currentCards = currentCards;
	}
	public String toString()
	{
		String w="Hand : ";
		for(int i=0;i<52;i++)
		{
			if(currentCards[i]!=null)
			{
				w+=currentCards[i].toString();
				w+="\n";
			}
			
		}
		return w;
	}
	
	
}
