package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	private int id;
	private int discountRate;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, int discountRate) {
		this.id = id;
		this.discountRate = discountRate;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	@Override
	public String toString() {
		return "Id: " + id +
				"\nİndirim Oranı: " + discountRate; 
	}
}
