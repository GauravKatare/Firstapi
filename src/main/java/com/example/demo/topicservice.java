package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicservice {

	private List<topic> topics=new ArrayList<>(Arrays.asList(new topic("Gaurav",20178011,20),new topic("Gautam",2017011,17)));
	
	public List<topic> gettopic(){
		return topics;
	}
	
	public topic gettopic(String name){
		return topics.stream().filter(t->t.getName().equals(name)).findFirst().get();
	}
	
	public void addtopic(topic t){
		topics.add(t);
	}

	public void delete(String name) {
		for(int i=0;i<topics.size();i++)
		{
			topic t=topics.get(i);
			if(t.getName().equals(name))
			{
				topics.remove(i);
				break;
			}
		}
	}

	public void update(String name,String newname) {
		for(int i=0;i<topics.size();i++)
		{
			topic t=topics.get(i);
			if(t.getName().equals(name))
			{
				t.setName(newname);
				break;
			}
		}
	}
}
