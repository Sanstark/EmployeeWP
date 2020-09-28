package EmployeeWageCode;

public class UC4 {
	static final int full_time = 1;
	static final int wage_per_hour = 20;
	static final int part_time = 2;
	
	public static void main(String[] args) {
		int emphours = 0;
		int empwage = 0;
		
	int employeecheck = (int) Math.floor(Math.random()*10)%3;
		switch (employeecheck) {
		case fulltime:
			emphours = 8;
			break;
		case parttime:
			emphours = 8;
			break;
		default:
			emphours = 0;
			break;
		}
		empwage = emphours*wageperhour;
		System.out.println("Daily Employee Wage :" +empwage);
	}	

}
