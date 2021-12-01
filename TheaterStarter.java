package com.xworkz.runTimeException;

import com.xworkz.runTimeException.Theater;
import com.xworkz.runTimeException.constants.TicketType;

public class TheaterStarter {

	public static void main(String[] args) {
        Theater  theater = new Theater("mugilpete");
        theater.bookTicket("mugilpete", TicketType.GANDHI_CLASS, 5);
        theater.bookTicket("mugilpete", TicketType.MIDDLE_CLASS, 5);
        theater.bookTicket("mugilpete",TicketType.BALCONY, 2);
        System.out.println("after booking ....");
	}

}
