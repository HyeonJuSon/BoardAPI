package com.son.board.model.service;

import java.sql.SQLException;

import com.son.board.model.dto.UserDto;

public interface UserService {
	
	UserDto login(String userid, String userpw) throws SQLException;
	UserDto findById(String userid) throws SQLException;
	boolean join(UserDto userDto) throws SQLException;
	
}
