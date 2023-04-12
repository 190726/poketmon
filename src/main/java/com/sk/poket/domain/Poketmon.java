package com.sk.poket.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Poketmon {
	
	private Long id;
	private String name;
	private String image;

}
