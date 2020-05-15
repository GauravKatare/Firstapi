package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class topicservice {

	@Autowired
	private topicrepo repo;

	public List<topic> gettopic(){
		List<topic> t=new ArrayList<>();
		repo.findAll().forEach(t::add);
		return t;
	}
	
	public Optional<topic> gettopic(String name){
		return repo.findById(name);
	}
	
	public void addtopic(topic t){
		repo.save(t);
	}

	public void delete(String name) {
		repo.deleteById(name);
	}

	public void update(topic t) {
		repo.save(t);
	}
}
