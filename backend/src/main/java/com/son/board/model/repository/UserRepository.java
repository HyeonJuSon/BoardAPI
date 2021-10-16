package com.son.board.model.repository;

import java.sql.SQLException;

import com.son.board.model.dto.UserDto;

public interface UserRepository {
	
	// login
	UserDto login(String userid, String userpw) throws SQLException;
	// c
	int insert(UserDto userDto) throws SQLException;
	// r
	UserDto findById(String userid) throws SQLException;	
	// u
	
	// d
}
