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
		Poketmon p1 = new Poketmon(1L, "나오하", "001.png");
		Poketmon p2 = new Poketmon(2L, "나로테", "002.png");
		Poketmon p3 = new Poketmon(3L, "마스카나", "003.png");
		Poketmon p4 = new Poketmon(4L, "뜨아거", "004.png");
		model.addAttribute("poket1", p1);
		model.addAttribute("poket2", p2);
		model.addAttribute("poket3", p3);
		model.addAttribute("poket4", p4);
		return "poket";
	}
}