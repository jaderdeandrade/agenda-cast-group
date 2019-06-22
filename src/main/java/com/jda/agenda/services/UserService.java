package com.jda.agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jda.agenda.domain.User;
import com.jda.agenda.repository.UserRepository;

/**
 * 
 * Application entry point.
 *
 * @author <a href="mailto:jaderdeandrade@gmail.com">Jader T. Andrade</a>.
 * @param args array passed to this method 
 * void
 */
@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}

}
