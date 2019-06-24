package com.covalense.javaapp.arrays;

public class TestEMP {

	@SuppressWarnings("unused")
	private static Employee e;

	public static void main(String[] args) {

		Employee[] emp = new Employee[4];

		Employee e1 = new Employee();
		e1.setId(2);
		e1.setName("riya");
		e1.setSalary(450000);
		emp[0] = e1;

		Employee e2 = new Employee();
		e2.setId(23);
		e2.setName("riyanka");
		e2.setSalary(45400);
		emp[1] = e2;

		Employee e3 = new Employee();
		e3.setId(56);
		e3.setName("sayu");
		e3.setSalary(100098);
		emp[2] = e3;

		Employee e4 = new Employee();
		e4.setId(9);
		e4.setName("sinu");
		e4.setSalary(850000);
		emp[3] = e4;

		for (Employee e : emp) {

			System.out.println("name is " + e.getName());
			System.out.println("id is " + e.getId());
			System.out.println("salary is " + e.getSalary());
			System.out.println("*****************************");
		}
	}
}
