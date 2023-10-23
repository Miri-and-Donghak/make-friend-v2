package com.miri_and_donghak.makefriend.components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lobby extends JFrame {
    public static JPanel createLobby(){
        JPanel lobby = new JPanel();

        JButton makeFriendButton = new JButton("친구 만들기");
        JButton showMyFriend = new JButton("친구한테 가기");

        lobby.add(makeFriendButton);
        lobby.add(showMyFriend);
        return lobby;
    }
}
// 컴포넌트가 상위임