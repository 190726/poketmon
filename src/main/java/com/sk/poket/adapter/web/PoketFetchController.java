package com.sk.poket.adapter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.poket.adapter.data.PoketJpaRepository;
import com.sk.poket.domain.Poketmon;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/poket")
public class PoketFetchController {
	
	@Autowired PoketJpaRepository poketJpaRepository;
	
	@PostMapping("/9g")
	public Poketmon save(Poketmon save) {
		return new Poketmon(null, "", "");
	}
	
	@GetMapping("/9g/{no}")
	public String findBy(@PathVariable String no) {
		log.info(no);
		return "뜨아거";
	}
}
