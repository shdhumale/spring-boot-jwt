package com.javainuse.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javainuse.model.MyUserDetails;

@Service
public class MyJwtUserDetailsService {

	
	public MyUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("siddhuname15001234567890siddhuid".equals(username)) {
			MyUserDetails objMyUserDetails = new MyUserDetails();
			objMyUserDetails.setUsername(username);
			return objMyUserDetails;
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}