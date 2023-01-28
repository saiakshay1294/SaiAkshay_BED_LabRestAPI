package com.glearning.students.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import com.glearning.students.dao.StudentRepository;
import com.glearning.students.dao.UserRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BootstrapAppData {
	
	private final UserRepository userRepository;
	private final StudentRepository studentRepository;
	
	
	
	@EventListener(ApplicationReadyEvent.class)
	public void initializeData(ApplicationReadyEvent readyEvent) {
		
		
		
	}

}
