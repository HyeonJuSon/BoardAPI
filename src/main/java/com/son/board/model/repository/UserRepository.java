package com.son.board.model.repository;

import java.sql.SQLException;

import com.son.board.model.dto.UserDto;

public interface UserRepository {
	
	UserDto findById(String userid) throws SQLException;
	
}
