package com.miri_and_donghak.makefriend.frame.panels;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Lobby extends JPanel{
    JPanel lobby = new JPanel();
    JButton makeFriendButton = new JButton("친구 만들기");
    JButton showMyFriend = new JButton("친구한테 가기");

    public Lobby(){
        makeFriendButton.addActionListener(l -> {
            System.out.println("[LOG] 친구 만들기가 눌렸습니다.");
        });

        add(makeFriendButton);
        add(showMyFriend);
    }
}
// 컴포넌트가 상위임