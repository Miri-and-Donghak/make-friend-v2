package com.miri_and_donghak.makefriend.components;

import javax.swing.JFrame;

public class ComponentManager extends JFrame{
   private int count = 0;
   
    public ComponentManager(){
        add(Lobby.getLobby());

        setTitle("동학이 친구 만들기");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
   }
}
