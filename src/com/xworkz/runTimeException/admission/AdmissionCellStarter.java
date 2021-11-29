package com.xworkz.runTimeException.admission;

import com.xworkz.runTimeException.admission.AdmissionCell;

public class AdmissionCellStarter {

	public static void main(String[] args) throws  MBBSSeatException{
		AdmissionCell admissionCell = new AdmissionCell();
		admissionCell.admitForMbbs("Rachana", true, true);
        System.out.println("even though there is data issue,");
	}

}
