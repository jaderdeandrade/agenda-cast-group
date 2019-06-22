package com.jda.agenda.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jda.agenda.domain.User;

/**
 * 
 * Application entry point.
 *
 * @author <a href="mailto:jaderdeandrade@gmail.com">Jader T. Andrade</a>.
 * @param args array passed to this method 
 * void
 */

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
