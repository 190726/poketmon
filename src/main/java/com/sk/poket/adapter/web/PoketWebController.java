package com.sk.poket.adapter.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sk.poket.domain.Poketmon;

@Controller
@RequestMapping("/web")
public class PoketWebController {
	
	@GetMapping("/poket")
	public String poket(Model model) {
		Poketmon p = new Poketmon(1L, "뜨아거", "001.png");
		model.addAttribute("poket", p);
		return "poket";
	}
}