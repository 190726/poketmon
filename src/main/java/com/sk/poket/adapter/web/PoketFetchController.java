package com.sk.poket.adapter.web;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sk.poket.adapter.data.PoketJpaRepository;
import com.sk.poket.domain.Poketmon;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/poket")
public class PoketFetchController {
	
	@Autowired PoketJpaRepository poketJpaRepository;
	
	@PostMapping("/9g")
	public Poketmon save(@RequestParam("name") String name,
			@RequestParam("file") MultipartFile file) throws IOException {
		System.out.println(name);
		System.out.println(file.getOriginalFilename());
		Poketmon saved = poketJpaRepository.save(new Poketmon(null, name, file.getOriginalFilename(), file.getBytes(), null));
		return saved;
	}
	
	@GetMapping("/9g/{no}")
	public String findBy(@PathVariable String no) {
		log.info(no);
		return "뜨아거";
	}
}
