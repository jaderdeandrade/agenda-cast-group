package com.jda.agenda.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jda.agenda.domain.User;

/**
 * 
 * Application entry point.
 *
 * @author <a href="mailto:jaderdeandrade@gmail.com">Jader T. Andrade</a>.
 * @param args array passed to this method 
 * void
 */

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		
		User joao = new User("1","joão das couves", "392","santa cruz","caratinga","MG","33 99956-4748","33 3321-8144");
		User maria = new User("1","maria louca", "22","zacarias","caratinga","MG","33 99956-4447","33 3321-3444");
		List<User> list = new ArrayList<User>();
		list.addAll(Arrays.asList(joao,maria));
		return ResponseEntity.ok().body(list);
	}

	
	
}
