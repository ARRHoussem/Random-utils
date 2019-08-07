package org.sid.dao;

import java.util.List;

import org.sid.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<AppUser, Long>{
	
	
	public AppUser findUserByUsername(String username) ;
	
	
	
	@Query("select u from AppUser u join u.roles role where role.roleName like :x")
	public List<AppUser> findUserByRole(@Param("x")String roles);
}
