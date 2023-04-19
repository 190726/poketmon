package com.sk.poket.adapter.web;

import java.io.IOException;

import javax.transaction.Transactional;

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
public class PoketUpdateController {
	
	@Autowired PoketJpaRepository poketJpaRepository;
	
	@Transactional
	@PostMapping("/9g")
	public Poketmon save(@RequestParam("name") String name,
			@RequestParam("file") MultipartFile file) throws IOException {
		
		var poketmon = new Poketmon(null, name, file.getOriginalFilename(), file.getBytes(), null);
		log.info("save request is {}", poketmon);
		
		return poketJpaRepository.save(poketmon);
	}
	
}
