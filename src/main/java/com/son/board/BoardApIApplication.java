package com.son.board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableAspectJAutoProxy
@MapperScan(basePackages = "com.son.board.model.repository") // mybatis
public class BoardApIApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(BoardApIApplication.class, args);
	}

}
