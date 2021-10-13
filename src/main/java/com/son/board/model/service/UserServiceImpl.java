package com.son.board.model.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.son.board.model.dto.UserDto;
import com.son.board.model.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public UserDto findById(String userid) throws SQLException {
		return userRepository.findById(userid);
	}

}
