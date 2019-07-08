package com.covalense.designpattens.builder;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public final class EmployeeInfoData2 {

	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joining_date;
	private int account_number;
	private String email;
	private String designation;
	private Date dob;
	private int dept_id;
	private int mngr_id;

	private EmployeeInfoData2(EmployeeDataTwoBuilder builder) {
		id = builder.id;
		name=builder.name;
		age = builder.age;
		gender=builder.gender;
		salary = builder.salary;
		joining_date=builder.joining_date;
		account_number = builder.account_number;
		email=builder.email;
		designation = builder.designation;
		dob=builder.dob;
		dept_id = builder.dept_id;
		mngr_id=builder.mngr_id;
		
	}

	public static class EmployeeDataTwoBuilder {

		private int id;
		private String name;
		private int age;
		private String gender;
		private double salary;
		private long phone;
		private Date joining_date;
		private int account_number;
		private String email;
		private String designation;
		private Date dob;
		private int dept_id;
		private int mngr_id;

		public EmployeeDataTwoBuilder id(int id) {
			this.id = id;
			return this;
		}

		public EmployeeDataTwoBuilder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeDataTwoBuilder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeDataTwoBuilder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeDataTwoBuilder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeDataTwoBuilder phone(long phone) {
			this.phone = phone;
			return this;
		}

		public EmployeeDataTwoBuilder joining_date(Date joining_date) {
			this.joining_date = joining_date;
			return this;
		}

		public EmployeeDataTwoBuilder account_number(int account_number) {
			this.account_number = account_number;
			return this;
		}

		public EmployeeDataTwoBuilder email(String email) {
			this.email = email;
			return this;
		}

		public EmployeeDataTwoBuilder designation(String designation) {
			this.designation = designation;
			return this;
		}

		public EmployeeDataTwoBuilder dob(Date dob) {
			this.dob = dob;
			return this;
		}

		public EmployeeDataTwoBuilder dept_id(int dept_id) {
			this.dept_id = dept_id;
			return this;
		}

		public EmployeeDataTwoBuilder mngr_id(int mngr_id) {
			this.mngr_id = mngr_id;
			return this;
		}
		
		public EmployeeInfoData2 build() {
			return new EmployeeInfoData2(this);
		}
	}
}