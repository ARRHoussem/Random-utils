package org.sid.dao;

import org.sid.entities.Uploads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadRepository extends JpaRepository<Uploads, Long>{
	
	public Uploads findUploadById(Long id) ;
}
