package com.xworkz.runTimeException.amazonPrime;

import com.xworkz.runTimeException.amazonPrime.NotaPrimeMemberException;

public class AmazonPrime {

	public void freeDelivery(boolean primeMember,String country)throws  NotaPrimeMemberException
	{
		System.out.println("invoked freeDelivery method");
		if(primeMember && country!=null && country.length()>3 && country.length()<=20)
		{
			System.out.println("can take membership");
		}
		else {
			System.err.println("cannot take membership");
			
				throw  new NotaPrimeMemberException();
		}
	}
}
