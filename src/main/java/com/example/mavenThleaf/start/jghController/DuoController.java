package com.example.mavenThleaf.start.jghController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mavenThleaf.start.service.DuoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
//@PreAuthorize("hasAnyAuthority('USER','ADMIN','HRD-MNG','PAY-MNG','ITEM-MNG','CHP-MNG')")
public class DuoController {

	@Autowired
	DuoService duoService;

	@GetMapping("/jgh")
	public String duoInfo(Model model) {

		return "jgh/DuoMain";
	}

}
