package com.xworkz.runTimeException.medical;


import com.xworkz.runTimeException.medical.MedicalInsurance;

public class MedicalTester {

	public static void main(String[] args)  throws  CashLessException{
		MedicalInsurance medical = new MedicalInsurance();
				medical.canAvailCashLess(6.00,"dddd");
		        System.out.println("yes.....");

	}
}
