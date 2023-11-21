package com.miri_and_donghak.makefriend;

import com.miri_and_donghak.makefriend.component.lobby.Lobby;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

@SpringBootApplication
public class MakeFriendApplication {
	public static void main(String[] args) throws IOException {
		Lobby lobby = new Lobby();
		SpringApplication.run(MakeFriendApplication.class, args);
	}
}
