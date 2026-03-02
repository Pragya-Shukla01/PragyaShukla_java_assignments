package com.coforge;


public class UniversityExamRules {
	static final String universityCode = "PSIT";
	static final int minAttendance = 90;
	
	static int hallTicketCounter = 1002;

	public UniversityExamRules() {
		super();
	}
	
	static String generateHallTicket() {
		hallTicketCounter++;
		return universityCode +((int) (Math.random()*100))+"-"+hallTicketCounter;
	}
}
