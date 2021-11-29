package com.xworkz.runTimeException.electoral;


import com.xworkz.runTimeException.electoral.NotEligibleforVoteException;

public class ElectoralCommision {
	public void canVote(String name,int age)throws  NotEligibleforVoteException
	{
		System.out.println("invoked canVote");
		if(name !=null && name.length()>2 && name.length()<=26 && age>=18)
		{
			System.out.println("eligible for vote");
		}
		else {
			System.err.println("not eligible for vote");
			
				throw  new NotEligibleforVoteException();
		}
	}
}

