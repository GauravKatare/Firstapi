package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping("/topic/{name}")
	public topic topicbyname(@PathVariable String name)
	{
		System.out.println("helloname");
		return ts.gettopic(name);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topic")
	public void addtopic(@RequestBody topic t)
	{
		System.out.println("ADDED");
		ts.addtopic(t);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{name}")
	public void deletetopic(@PathVariable String name)
	{
		System.out.println("delete");
		ts.delete(name);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update/{name}")
	public void updatetopic(@RequestBody topic t,@PathVariable String name)
	{
		System.out.println("update");
		ts.update(name,t.getName());
	}
}
