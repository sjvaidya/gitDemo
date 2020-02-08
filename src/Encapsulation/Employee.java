package Encapsulation;

/*
Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed
only through any member function of own class in which they are declared.

As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.

Encapsulation can be achieved by:
Declaring all the variables in the class as private and
writing public methods in the class to set and get the values of variables.
*/

public class Employee {

    // private variables declared  
    // these can only be accessed by  
    // public methods of class 
	private String name;
	private int id;
	private long salary;
	
    // get method for Name to access  
    // private variable name 
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public void setName(String newName) {
		
	name = newName;
	}
	
	public void setID(int newId) {
	
	id = newId;	
	}

	public void setSalary(int newSalary) {
		
	salary = newSalary;
	}

	
}

