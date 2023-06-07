package com.weblogic.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weblogic.spring.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}