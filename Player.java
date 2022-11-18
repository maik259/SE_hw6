package task2;

public class Player {	
	private int heldCard;
	
	public Player(int cardValue) {
		setHeldCard(cardValue);
	}
	
	public void setHeldCard(int cardValue) {
		this.heldCard = cardValue;
	}
	
	public int getHeldCard() {
		return this.heldCard;
	}
}
