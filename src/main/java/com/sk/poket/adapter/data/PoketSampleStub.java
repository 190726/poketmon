package com.sk.poket.adapter.data;

import java.util.Arrays;
import java.util.List;

import com.sk.poket.domain.Poketmon;

public class PoketSampleStub {

	public static List<Poketmon> poketmons() {
		Poketmon p1 = new Poketmon(1L, "나오하", "001.png", null);
		Poketmon p2 = new Poketmon(2L, "나로테", "002.png", null);
		Poketmon p3 = new Poketmon(3L, "마스카나", "003.png", null);
		Poketmon p4 = new Poketmon(4L, "뜨아거", "004.png", null);
		return Arrays.asList(p1, p2, p3, p4);
	}
}
