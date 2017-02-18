package entities;

public class Item {

	private int initialAmount;
	private int lostPercentage;
	private int costOfOne;
	
	public Item (int initialAmount, int lostPercentage, int costOfOne) {
		this.initialAmount = initialAmount;
		this.lostPercentage = lostPercentage;
		this.costOfOne = costOfOne;
	}
	
	private int calculateLostAmount() {
		return initialAmount*(lostPercentage/100);
	}
	
	public int calculateCostOfLost() {
		return calculateLostAmount()*costOfOne;
	}
	
	public int calculateRemainingAmount() {
		return initialAmount-calculateLostAmount();
	}
	
	public int getCostOfOne() {
		return costOfOne;
	}
	
}
