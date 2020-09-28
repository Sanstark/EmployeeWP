package EmployeeWageCode;

public class UC3 {
	static final int fulltime = 1;
	static final int wageperhour = 20;
	static final int parttime = 2;
	
	public static void main(String[] args) {
		int emphours = 0;
		int empwage = 0;
		
	int employeecheck = (int) Math.floor(Math.random()*10)%3;
		if (employeecheck == fulltime)
			emphours = 8;
		else if (employeecheck == parttime)
			emphours = 8;
		else
			emphours = 0;
		empwage = emphours*wage_per_hour;
		System.out.println("Daily Employee Wage :" +empwage);
		
	}

}
