package io.cloudtype.Demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/test")
    public String default01() {

        System.out.println("test");

        return "test";
    }
}
