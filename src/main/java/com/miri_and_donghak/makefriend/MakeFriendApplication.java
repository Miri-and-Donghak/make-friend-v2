package com.miri_and_donghak.makefriend;

import javax.swing.JFrame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.miri_and_donghak.makefriend.components.Settings;

@SpringBootApplication
public class MakeFriendApplication extends JFrame{

	public static void main(String[] args) {
		SpringApplication.run(MakeFriendApplication.class, args);

		new Settings();
	}

}
