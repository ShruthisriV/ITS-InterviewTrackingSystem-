package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wipro.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	@Query("select m from Admin m where m.email=:email and m.password=:password")
	Admin findByEmailAndPassword(String email,String password);

}
