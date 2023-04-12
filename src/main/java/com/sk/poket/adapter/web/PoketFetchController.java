package com.sk.poket.adapter.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController 
public class PoketFetchController {
	
	@GetMapping("/find/{no}")
	public String findBy(@PathVariable String no) {
		log.info(no);
		return "뜨아거";
	}
}
