package com.xworkz.runTimeException.medical;

import com.xworkz.runTimeException.medical.CashLessException;

public class MedicalInsurance {
	

		public void canAvailCashLess(double totalHour,String name)throws  CashLessException
		{
			System.out.println("invoked canAvailCashLess method");
			if( name!=null && name.length()>3 && name.length()<=20 && totalHour>=8)
			{
				System.out.println("can be AvailCashLess");
			}
			else {
				System.err.println("cannot be AvailCahsLess");
				
					throw  new CashLessException();
			}
		}
	}

