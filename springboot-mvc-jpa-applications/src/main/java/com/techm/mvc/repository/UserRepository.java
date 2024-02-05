package com.techm.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techm.mvc.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
