package com.covalense.assessment.carbrand;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;



@Log
public class CarbeanTest {

	public static void main(String[] args) {

		ArrayList<Carbean> cars = new ArrayList<>();
		cars.add(new Carbean("Marcopolo", "Tata Motors"));
		cars.add(new Carbean("Tata Prima", "Tata Motors"));
		cars.add(new Carbean("Swift DZire", "Maruti Suzuki"));
		cars.add(new Carbean("GO+", "Maruti Suzuki"));
		cars.add(new Carbean("Audi AG", "volkswagen"));
		cars.add(new Carbean("Audi A6+", "volkswagen"));
		cars.add(new Carbean("BMWG", "BMW"));
		cars.add(new Carbean("phanthom", "Rolls Royce"));

		int option=3;
		Predicate<Carbean> brand = null;
		switch (option) {
		case 1: brand=i-> i.getBrand()=="Tata Motors";
		break;
		case 2: brand=i-> i.getBrand()=="Maruti Suzuki";
		break;
		case 3: brand=i-> i.getBrand()=="volkswagen";
		break;
		case 4: brand=i-> i.getBrand()=="BMW";
		break;
		case 5: brand=i-> i.getBrand()=="Rolls Royce";
		break;

		default:log.info("Choose valid brand name");
		break;
		}

		List<Carbean> carsList=cars.stream().filter(brand).collect(Collectors.toList());
		for (Carbean carsBean : carsList) {
			log.info("Cars from this brand are: "+carsBean.getCar());
		}
	}

}
