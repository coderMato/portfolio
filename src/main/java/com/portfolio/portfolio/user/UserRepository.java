package com.portfolio.portfolio.user;

import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, ObjectId> {
	Mono<User> findByUsername(String user);

	Mono<User> findByEmail(String email);

	Mono<User> findByConfirmationToken(String token);
}
