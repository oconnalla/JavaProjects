//*******************************************************************
//Product Constructor Assignment 10
//
//allows for various ticket object types
//By: Ariel OConnall
//Date 3/15/20
//*******************************************************************

package ch9;

public class Ticket {

	protected int number;
	protected double price;
	
	public Ticket(int number ) {
		this.number = number;
	}
	
	
	public double getPrice() {
		return 50.0;
	}


	@Override
	public String toString(){
		return("Number: " + number + ", Price: " + getPrice());
		
	}
}
