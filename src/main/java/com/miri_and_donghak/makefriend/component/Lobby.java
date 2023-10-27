package com.miri_and_donghak.makefriend.component;

import com.miri_and_donghak.makefriend.util.ButtonUtil;
import com.miri_and_donghak.makefriend.util.FontUtil;

import javax.swing.*;
import java.awt.*;

public class Lobby extends JFrame{
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public Lobby(){
        JPanel lobby = new JPanel(new GridBagLayout());

        JButton makeFriendButton = ButtonUtil.createButton("친구 만들기");
        JButton showMyFriend = ButtonUtil.createButton("친구한테 가기");

        makeFriendButton.addActionListener(l -> {
            new MakeFriend();
            setVisible(false);
        });

        showMyFriend.addActionListener(l ->{
            new ShowMyFriends();
            setVisible(false);
        });

        lobby.add(makeFriendButton);
        lobby.add(showMyFriend);

        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);

        add(lobby);
    }
}