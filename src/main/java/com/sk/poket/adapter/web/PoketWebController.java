package com.sk.poket.adapter.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class PoketWebController {
	
	@GetMapping("/poket")
	public String poket(Model model) {
		model.addAttribute("data", "뜨아거");
		return "poket";
	}
}