package com.covalense.assessment.songbydate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class SongDateTest {
	public static void main(String[] args) {
		ArrayList<Song> beans = new ArrayList<>();
		beans.add(new Song("maanga.mp3", LocalDateTime.of(2019,07,11, 10,43)));
		beans.add(new Song("sfsgsghfhgf.mp3", LocalDateTime.of(2019,07,11, 10,43)));

		Comparator<Song> c = (i, j) -> i.getDate().compareTo(j.getDate())*-1;
		List<Song> list = beans.stream().sorted(c).collect(Collectors.toList());
		for (Song music : list) {
			log.info("list of songs are: " + music);
		}

	}
}
