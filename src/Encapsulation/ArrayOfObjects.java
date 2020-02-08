package Encapsulation;

public class ArrayOfObjects {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp[] = new Employee[4];
			
		for (int i=0; i<4; i++) {
			
			Emp[i] = new Employee();
			
			Emp[i].setID(1470 + i);
			Emp[i].setName("Name" + i);
			Emp[i].setSalary(10000 + i*1000);
			
			System.out.println("ID = " + Emp[i].getId());
			System.out.println("Name = " + Emp[i].getName());
			System.out.println("Salary = " + Emp[i].getSalary());
			
		}
//		Emp.setID(1470);
//		Emp.setName("Sanket Vaidya");
//		Emp.setSalary(10000);
//		
//		System.out.println("ID = " + Emp.getId());
//		System.out.println("Name = " + Emp.getName());
//		System.out.println("Salary = " + Emp.getSalary());
	}

	
}
