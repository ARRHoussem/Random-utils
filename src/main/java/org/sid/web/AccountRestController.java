package org.sid.web;



import org.sid.entities.AppUser;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class AccountRestController {
	@Autowired
	private AccountService accountService;
	@PostMapping("/register")
	public AppUser register (@RequestBody AppUser user) {
		return accountService.saveUser(user);
	}

}
