package com.miri_and_donghak.makefriend.component;

import javax.swing.*;
import java.awt.*;

public class Lobby extends JFrame{
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public Lobby(){
        JPanel lobby = new JPanel(new GridBagLayout());

        JButton makeFriendButton = createButton("친구 만들기");
        JButton showMyFriend = createButton("친구한테 가기");

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

    private static Font getFonts(){
        Font font = new Font("Pretendard Variable", Font.BOLD, 15);
        return font;
    }

    private static JButton createButton(String title){
        JButton button = new JButton(title);
        button.setPreferredSize(defaultButtonSize);
        button.setFont(getFonts());

        return button;
    }
}