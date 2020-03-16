package ch9;

public class AdvanceTicket extends Ticket{
	protected int days;
	
	public AdvanceTicket(int number, int days) {
		super(number);
		this.days = days;
	}
	@Override
	public double getPrice() {
		if(this.days > 10) {
			 price = 30.0;
			return price;
		}else if(this.days < 10){
			 price = 40.0;
			return price;
		}
		return price;
	}
	
	@Override
	public String toString(){
		return super.toString();
		
	}
	
}
