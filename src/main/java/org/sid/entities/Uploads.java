package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Uploads {
	@Id @GeneratedValue
	private Long id;
	private String path;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Uploads() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Uploads(String path) {
		super();
		this.path = path;
	}
	
	
}
