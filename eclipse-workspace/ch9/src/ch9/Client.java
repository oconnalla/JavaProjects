package ch9;

import ch9.Ticket;
import ch9.AdvanceTicket;

public class Client {
	public static void main(String[] args) {

		Ticket t1 = new AdvanceTicket(1,1);
		Ticket t2 = new AdvanceTicket(2, 15);
		Ticket t3 = new WalkupTicket(1);
		

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
