package com.son.board.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.son.board.model.dto.UserDto;
import com.son.board.model.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class UserController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	@Autowired
	private UserService uService;
	
	@ApiOperation(value = "특정 회원의 정보를 반환한다.", response = UserDto.class)
	@GetMapping("/user/{userid}")
	public ResponseEntity<UserDto> findById(@PathVariable String userid) throws SQLException{
		UserDto target =  uService.findById(userid);
		if(target==null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity<UserDto>(target, HttpStatus.OK);
	}
	
	@ApiOperation(value="회원 가입")
	@PostMapping("/user/join")
	public ResponseEntity<String> insert(@RequestBody UserDto userDto) throws SQLException{
		System.out.println("회원 가입"+userDto);
		if(uService.join(userDto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
}
