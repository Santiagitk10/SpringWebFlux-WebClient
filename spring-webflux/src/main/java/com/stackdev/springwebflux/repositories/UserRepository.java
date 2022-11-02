package com.stackdev.springwebflux.repositories;

import com.stackdev.springwebflux.models.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCrudRepository<Users, Long> {
}

//Se extiende del ReactiveCrudRepository porque no se está usando JPA. JPA funciona con bases
//de datos relacionales, Hibernate es una implementación de JPA