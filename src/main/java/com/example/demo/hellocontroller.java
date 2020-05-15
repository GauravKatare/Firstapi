package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

	@Autowired
	private topicservice ts;
	
	@RequestMapping("/topic")
	public List<topic> hello()
	{
		System.out.println("hello");
		return ts.gettopic();
	}
	
	@RequestMapping("/hello")
	public String Topic()
	{
		System.out.println("Topic");
		return "hello";
	}
}
