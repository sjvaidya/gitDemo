package Encapsulation;

public class RunEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp = new Employee();
			
		Emp.setID(1470);
		Emp.setName("Sanket Vaidya");
		Emp.setSalary(10000);
		
		System.out.println("ID = " + Emp.getId());
		System.out.println("Name = " + Emp.getName());
		System.out.println("Salary = " + Emp.getSalary());
	}

}
