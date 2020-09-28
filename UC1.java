package EmployeeWageCode;

public class UC1 {
	public static void main(String[] args) {
	int Fulltime = 1;
	double employeecheck = Math.floor(Math.random()*10)%2;
		if (employeecheck == Fulltime)
			System.out.println("Employee is Present");
		else 
			System.out.println("Employee is Absent");
	}

}
