package org.sid.dao;


import org.sid.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<AppRole, Long> {
	
	public AppRole findRoleByRoleName(String roleName);

}
