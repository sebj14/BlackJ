
public class Dealer extends Hand {

        /*contructor for dealer that contructes super class also*/
	public Dealer() {
		super();
		
		
	}
        /*Getting New card from a deck to hand*/
	public void GetCard(Card C)
	{
		this.AddCard(C);
		
	}
        /*printng hand for test cases*/
	public void ShowHand()
	{
		System.out.print(super.toString());
	
	}

}
