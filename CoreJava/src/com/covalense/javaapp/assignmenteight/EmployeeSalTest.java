package com.covalense.javaapp.assignmenteight;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;
@Log
public class EmployeeSalTest {

static Comparator<EmployeeSal> c=(a,b)->{
		
		if(a.getSalary()>b.getSalary()) {
			return 1;
		}else if(a.getSalary()<b.getSalary()) {
			return -1;
		}else {
			return 0;
		}
	};
	
	static EmployeeSal getHigh(ArrayList<EmployeeSal>al) {		
		return al.stream().max(c).get();
			}
			static EmployeeSal getLow (ArrayList<EmployeeSal>al) {
				return al.stream().min(c).get();
			}
	public static void main(String[] args) {
		
		EmployeeSal emp1=new EmployeeSal(1,"pravya",10987.98);
		EmployeeSal emp2=new EmployeeSal(2,"hari",5000.90);
		EmployeeSal emp3=new EmployeeSal(3,"shaym",3459.00);
		EmployeeSal emp4=new EmployeeSal(4,"ammu",2134000.9);
		EmployeeSal emp5=new EmployeeSal(5,"mahesh",45.78);
		
		ArrayList<EmployeeSal>al=new ArrayList<EmployeeSal>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		
		
		EmployeeSal s=getHigh(al);
		log.info("Highest salary is for "+s.getName()+" with salary  "+s.getSalary());
		
		EmployeeSal s11=getLow(al);
		log.info("Lowest salary is for "+s11.getName()+" with salary  "+s11.getSalary());
	}
}
