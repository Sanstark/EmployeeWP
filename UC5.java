package EmployeeWageCode;

public class UC5 {
	static final int fulltime = 1;
	static final int wageperhour = 20;
	static final int parttime = 2;
	static final int no_of_working_days = 20;
	
	public static void main(String[] args) {
		int emphours = 0;
		int empwage = 0;
		int totalempwage = 0;
		for (int i = 0; i<no_of_working_days; i++) {
		
	int employeecheck = (int) Math.floor(Math.random()*10)%3;
		
			if (empcheck == fulltime)
				emphours = 8;
			else if (empcheck == parttime)
				emphours = 8;
			else
				emphours = 0;
			empwage = emphours*wageperhour;
			totalempwage += empwage;
			System.out.println("Emp Wage: " + empwage);
		}
		System.out.println("Total Employee Wage :" +totalempwage);
		
	}

}
