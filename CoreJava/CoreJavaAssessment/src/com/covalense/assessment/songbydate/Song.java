package com.covalense.assessment.songbydate;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Song {
	private String music;
	private LocalDateTime date;
}
