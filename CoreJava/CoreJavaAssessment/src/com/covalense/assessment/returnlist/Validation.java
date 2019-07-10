package com.covalense.assessment.returnlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class Validation {
	public List<StudentBean> check(int i) {
		if (i == 1) {
			log.info("I am ArrayList");
			return new ArrayList<StudentBean>();
		} else if (i == 2) {
			log.info("I am LinkedList");
			return new LinkedList<StudentBean>();

		} else if (i == 3) {
			log.info("I am Vector");
			return new Vector<StudentBean>();
		}
		return null;
	}
}
