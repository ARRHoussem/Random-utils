package org.sid.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.sid.entities.AppRole;
import org.sid.entities.AppUser;

public interface AccountService {
	public AppUser saveUser(AppUser user);
	public AppRole saveRole(AppRole role);
	public void addRoleToUser(String username, String roleName);
	public AppUser findUserByUsername(String username);
	public void copyFolder(File src, File dest) throws IOException;

}
