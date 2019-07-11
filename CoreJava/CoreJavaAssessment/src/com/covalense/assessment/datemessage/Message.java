package com.covalense.assessment.datemessage;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Message {

	private String message;
	private LocalDateTime date;
}
