
import java.util.Random;
public class Deck {
	private Card[] cardsArray;
	private int[] shuffeledCards;
	int topDeck;
	
	
	
	  /*Regular contructor for TestCases*/
	public Deck(Card[] cardsArray, int[] shuffeledCards, int topDeck) {
		this.cardsArray = cardsArray;
		this.shuffeledCards = shuffeledCards;
		this.topDeck = topDeck;
	}
            /*Constructes the Deck in a Orderd Way*/
	public Deck() {
		Card[] cardTemp=new Card[52];
		String Name;
		int j=0;
		String[] w={"Hearts","Spades","Diamonds","Clubs"};
		for(int k=0;k< w.length;k++)
		{
			for(int i=1;i<=13;i++)
			{
				if(i==1)
				{
				 Name="Ace";
				}
				else if(i==11)
				{
					Name="Jack";
				}
				else if(i==12)
				{
					Name="Queen";
				}
				else if(i==13)
				{
					Name="King";
				}
				else 
					Name=i+"";
				String N=Name+" Of "+w[k];
				Card a=new Card(i,N,w[k].toString());
				cardTemp[j]=a;
				
				j++;
			}
		}
		this.cardsArray=cardTemp;
		this.shuffeledCards=new int[52];
		for(int i=0;i<52;i++)/*intiate the shuffled cards*/
                {
                    this.shuffeledCards[i]=i;
                }
		this.topDeck=51;
		
	}
        /*do shuffle dor cards by shuffling indexes*/
	public void ShuffleCards()
	{
		for(int i=0;i<52;i++)
			this.shuffeledCards[i]=-1;
		for(int i=0;i<52;i++)
		{
			 
			
			
				 
				 Random R = new Random();
				 int randomInt = R.nextInt(52);
				 while(isInto(randomInt)==true)
				 {
					  randomInt = R.nextInt(52);
					 
				 }
				 this.shuffeledCards[i]=randomInt;
			 
			 
		}
	}
        /*Check if j occours in shuffled cards*/
	public boolean isInto(int j)
	{
		
		for(int i=0;i<52;i++)
		{
		
			if(this.shuffeledCards[i]==j)
				return true;
		}
		return false;
	
	}
        /*get new card from the deck*/
	public Card getnextCard()
	{
		if(topDeck<0) return null;
		Card a=new Card(this.cardsArray[shuffeledCards[51-topDeck]]);
		this.topDeck--;
		return a;
		
	}
        /* Resetting the deck for starting new game*/
	public void ResetCards()
	{
		this.ShuffleCards();
		topDeck=this.cardsArray.length -1;
		
	}
	
	public Card[] getCardsArray() {
		return cardsArray;
	}
	public void setCardsArray(Card[] cardsArray) {
		this.cardsArray = cardsArray;
	}
	public int[] getShuffeledCards() {
		return shuffeledCards;
	}
	public void setShuffeledCards(int[] shuffeledCards) {
		this.shuffeledCards = shuffeledCards;
	}
	public int getTopDeck() {
		return topDeck;
	}
	public void setTopDeck(int topDeck) {
		this.topDeck = topDeck;
	}
	public String toString()
	{
		String w="";
		for(int i=0;i<cardsArray.length;i++)
		{
			w+=cardsArray[i].toString();
			w+="\n";
		}
		return w;
	}
	public String PrintShuffeledCards()
	{
		String w="";
		for(int i=0;i<cardsArray.length;i++)
		{
			w+=this.shuffeledCards[i]+" ";
		
		}
		return w;
	}
	
}
