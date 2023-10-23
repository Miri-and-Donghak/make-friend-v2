package com.miri_and_donghak.makefriend.components;

import javax.swing.JFrame;

public class Settings extends JFrame {
    final int WIDTH = 300, HEIGHT = 300;

    public Settings(){
        ComponentManager manager = new ComponentManager();

        add(manager.manegeComponent());

        setTitle("동학이 친구 만들기");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}