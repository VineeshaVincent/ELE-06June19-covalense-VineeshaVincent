package com.covalense.assessment.datemessage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class DateMessageTest {

	public static void main(String[] args) {
		ArrayList<Message> beans = new ArrayList<Message>();
		beans.add(new Message("Welocome to covalense", LocalDateTime.of(2019,07,11, 10,43)));
		beans.add(new Message("hi How are You?!!!!!!!!!!", LocalDateTime.of(2019,07,11, 10,44)));                                                                               

		Comparator<Message> c = (i, j) -> i.getDate().compareTo(j.getDate())*-1;
		
		List<Message> li = beans.stream().sorted(c).collect(Collectors.toList());
		for (Message message : li) {
			log.info("Message is " +message.getMessage());

		}

	}

}
