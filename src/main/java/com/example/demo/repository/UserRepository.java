package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.UserModel;
import java.util.*;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<UserModel, Long>{

	//@Query("SELECT ud from UserModel ud where ud.dateOfbirth>:age")
	@Query("FROM UserModel WHERE dateOfbirth > ?1")
	public List<UserModel> getAges(String dateOfbirth);
	
}
