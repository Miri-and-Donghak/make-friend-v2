package com.miri_and_donghak.makefriend.components;

import javax.swing.JPanel;

public class ComponentManager {
   private int count = 0;
   
   public JPanel manegeComponent(){
    if(count == 0){
        return Lobby.createLobby();
    } else return Lobby.createLobby();
   }
}
