package com.miri_and_donghak.makefriend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.miri_and_donghak.makefriend.components.ComponentManager;

@SpringBootApplication
public class MakeFriendApplication{

	public static void main(String[] args) {
		SpringApplication.run(MakeFriendApplication.class, args);

		new ComponentManager();
		new ComponentManager();
	}
}
