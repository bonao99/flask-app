package com.aysnax.dockerspringapp;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
    public String main(Model model) {
        
		model.addAttribute("welcomeMessage", "Welcome to 2023 Grocery Store");
		try {
			model.addAttribute("hostName","Now running on hostname " + InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "index"; //view
    }
	
}
