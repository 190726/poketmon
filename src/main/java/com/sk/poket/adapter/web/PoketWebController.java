package com.sk.poket.adapter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sk.poket.adapter.data.PoketJpaRepository;
import com.sk.poket.adapter.data.PoketSampleStub;
import com.sk.poket.domain.Poketmon;

@Controller
@RequestMapping("/web")
public class PoketWebController {
	
	@Autowired PoketJpaRepository poketJpaRepository;
	
	@GetMapping("/poket")
	public String poket(Model model) {
		model.addAttribute("poketmons", poketJpaRepository.findAll());
		return "poket";
	}
	
	@GetMapping("/save")
	public String save(Model model) {
		return "save";
	}
}