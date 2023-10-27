package com.miri_and_donghak.makefriend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MakeFriendApplication{

	public static void main(String[] args) {
		new ComponentManager();
		SpringApplication.run(MakeFriendApplication.class, args);
	}
}
