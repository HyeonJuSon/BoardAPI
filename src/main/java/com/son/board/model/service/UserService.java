package com.son.board.model.service;

import java.sql.SQLException;

import com.son.board.model.dto.UserDto;

public interface UserService {
	
	UserDto findById(String userid) throws SQLException;
	
}
