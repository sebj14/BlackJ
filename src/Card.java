

public class Card {

	private int value;
	private String name;
	private String suit;
	
	public Card(int value,String name1,String suit1)
	{
		this.value=value;
		this.name=name1;
		this.suit=suit1;
	}
	public Card(Card A)
	{
		this.value=A.value;
		this.name=A.name;
		this.suit=A.suit;
	}
	public Card()
	{
	
	}
	

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String toString()
	{
		return "CardName: "+this.name+" Value: "+this.value+" Suit: "+this.suit;
	}
	
}
