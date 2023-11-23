package com.miri_and_donghak.makefriend;

import com.miri_and_donghak.makefriend.component.custom.SwingContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

@SpringBootApplication
public class MakeFriendApplication {
	public static void main(String[] args){
		SwingContainer container = new SwingContainer();

		container.onlyLobby();

		SpringApplication.run(MakeFriendApplication.class, args);
	}
}
