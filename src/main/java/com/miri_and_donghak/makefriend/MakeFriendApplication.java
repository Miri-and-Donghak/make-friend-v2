package com.miri_and_donghak.makefriend;

import com.miri_and_donghak.makefriend.component.Lobby;
import com.miri_and_donghak.makefriend.domain.service.CharcterService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

@SpringBootApplication
public class MakeFriendApplication {
	public static void main(String[] args) throws IOException {
		Lobby lobby = new Lobby();
		SpringApplication.run(MakeFriendApplication.class, args);
	}
}
