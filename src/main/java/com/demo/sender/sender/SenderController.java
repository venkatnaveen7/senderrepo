package com.demo.sender.sender;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SenderController {

	@Value("${server.port}")
	private int serverPort;

	@GetMapping("/send")
	public String sendData(){
		return "Sender Application Running on "+serverPort;
	}
}
