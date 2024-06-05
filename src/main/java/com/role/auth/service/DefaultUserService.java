package com.role.auth.service;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.role.auth.DTO.UserRegisteredDTO;
import com.role.auth.model.User;

public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);
	
}
