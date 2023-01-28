package com.glearning.students.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import com.glearning.students.dao.StudentRepository;
import com.glearning.students.dao.UserRepository;
import com.glearning.students.model.Student;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BootstrapAppData {
	
	private final UserRepository userRepository;
	private final StudentRepository studentRepository;
	
	
	
	@EventListener(ApplicationReadyEvent.class)
	public void initializeData(ApplicationReadyEvent readyEvent) {
		
		Student ravi = new Student("Ravi", "Kumar", "Java", "India");
		Student harish = new Student("Harish", "Prasad", "Python", "India");
		Student ramesh = new Student("Ramesh", "Patil", "NodeJs", "India");
		Student krishna = new Student("Krishna", "Patel", "Java", "India");
		
		this.studentRepository.save(ravi);
		this.studentRepository.save(harish);
		this.studentRepository.save(ramesh);
		this.studentRepository.save(krishna);
		
		
	}

}
