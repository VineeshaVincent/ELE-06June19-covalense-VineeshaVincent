package com.covalense.javaapp.assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToObject {

	public static final String delimiter = ",";


	public static void main(String[] args) {
		String[] tempArr = null;
		BufferedReader br = null;
		List<Employee> empList = null;

		// csv file to read
		try {
			File file = new File("firstCsv.csv");
			FileReader fr = new FileReader(file);
			 br = new BufferedReader(fr);
             empList = new ArrayList<Employee>();

			String line = "";
           String one=br.readLine(); //read to skip the header
            
			while ((line = br.readLine()) != null) {
				tempArr = line.split(delimiter);
				
				if(tempArr.length > 0 )
                {
                    //Save the employee details in Employee object
                    Employee emp = new Employee();
                    empList.add(emp);
                }
            }
				

		} catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		//Lets print the Employee List
        for(Employee e : empList)
        {
            System.out.println(" name is: "+e.getEmployeeName()+" Id is: "+e.getId()+" Salary: "+e.getSalary());
        }
	}
	
		
		
	}



