package com.miri_and_donghak.makefriend.component;

import com.miri_and_donghak.makefriend.util.ButtonUtil;
import com.miri_and_donghak.makefriend.util.FontUtil;

import javax.swing.*;
import java.awt.*;

public class MakeFriend extends JFrame{
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public MakeFriend(){
        JPanel lobby = new JPanel(new GridBagLayout());

        JButton makeFriendButton = ButtonUtil.createButton("공");
        JButton showMyFriend = ButtonUtil.createButton("사중");

        lobby.add(makeFriendButton);
        lobby.add(showMyFriend);

        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);

        add(lobby);
    }
}