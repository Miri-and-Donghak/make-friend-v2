package com.miri_and_donghak.makefriend.component;

import com.miri_and_donghak.makefriend.util.ButtonUtil;
import com.miri_and_donghak.makefriend.util.FontUtil;
import jakarta.persistence.Lob;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Lobby extends JFrame{
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public Lobby(){

        JPanel lobby = new JPanel(new BorderLayout());

        lobby.setCursor(customcursor());
        lobby.add(createButtons(), BorderLayout.SOUTH);

        add(lobby);
        defaultSetting();
    }


    private void defaultSetting(){
        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);
    }

    public Cursor customcursor() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image cursorimage=tk.getImage("src/main/resources/images/cursor.png");

        Point point = new Point(0, 0);
        Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");

        return cursor;
    }

    private JPanel createButtons(){
        JButton makeFriendButton = ButtonUtil.createButton("친구 만들기");
        JButton showMyFriendButton = ButtonUtil.createButton("친구한테 가기");

        makeFriendButton.addActionListener(l -> {
            new MakeFriend();
            setVisible(false);
        });
        showMyFriendButton.addActionListener(l ->{
            new ShowMyFriends();
            setVisible(false);
        });

        JPanel buttons = new JPanel();

        buttons.add(makeFriendButton);
        buttons.add(showMyFriendButton);

        return buttons;
    }
}
