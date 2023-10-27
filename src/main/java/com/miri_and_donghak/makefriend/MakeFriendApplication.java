package com.miri_and_donghak.makefriend;

import com.miri_and_donghak.makefriend.component.Lobby;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class MakeFriendApplication{
	public static void main(String[] args) {
		Lobby lobby = new Lobby();
		SpringApplication.run(MakeFriendApplication.class, args);
	}
}
