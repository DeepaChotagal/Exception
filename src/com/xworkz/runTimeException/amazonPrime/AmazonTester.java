package com.xworkz.runTimeException.amazonPrime;

import com.xworkz.runTimeException.amazonPrime.AmazonPrime;

public class AmazonTester {

	
		public static void main(String[] args)  throws  NotaPrimeMemberException{
			AmazonPrime amazon = new AmazonPrime();
					amazon.freeDelivery(true,"india");
			        System.out.println("im eligible for voting successfully--");

		}

	}


