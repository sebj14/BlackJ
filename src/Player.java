
public class Player extends Hand {

	/*contructor that builds also the super class*/
	public Player() {
		super();
		
	}
        /*get new card from the deck and add it to the hand*/
	public void GetCard(Card C)
	{
		this.AddCard(C);
		
	}
        /*Prints the hand for test cases*/
	public void ShowHand()
	{
		System.out.print(super.toString());
	
	}
}
