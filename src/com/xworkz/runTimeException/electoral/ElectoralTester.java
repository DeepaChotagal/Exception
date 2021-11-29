package com.xworkz.runTimeException.electoral;

import com.xworkz.runTimeException.electoral.ElectoralCommision;

public class ElectoralTester {

	public static void main(String[] args)  throws  NotEligibleforVoteException{
		ElectoralCommision commission = new ElectoralCommision();
				commission.canVote("Deepa",20);
		        System.out.println("im eligible for voting successfully--");

	}

}
