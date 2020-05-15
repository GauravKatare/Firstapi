package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicservice {

	private List<topic> topics=Arrays.asList(new topic("Gaurav",20178011,20),new topic("Gautam",2017011,17));
	
	public List<topic> gettopic(){
		return topics;
	}
	
}
