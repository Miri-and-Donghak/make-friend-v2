package com.miri_and_donghak.makefriend.component;

import com.miri_and_donghak.makefriend.util.ButtonUtil;
import com.miri_and_donghak.makefriend.util.FontUtil;
import jakarta.persistence.Lob;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Lobby extends JFrame{
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public Lobby(){
        setBlankCursor();
        JLabel point = new JLabel("ㅎㅇ");
        point.setFont(FontUtil.getFonts());

        JPanel lobby = new JPanel(new BorderLayout());

        lobby.addMouseMotionListener(new MouseAdapter() {
            int count = 0;
            @Override
            public void mouseMoved(MouseEvent e) {
                point.setLocation(e.getX(), e.getY() - 380);
            }
        });

        lobby.add(point);
        lobby.add(createButtons(), BorderLayout.SOUTH);

        add(lobby);

        defaultSetting();
    }

    private void setBlankCursor(){
        BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");
        getContentPane().setCursor(blankCursor);
    }

    private void defaultSetting(){
        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);
    }

    private JButton createMakeFriendButton(){
        JButton makeFriendButton = ButtonUtil.createButton("친구 만들기");

        makeFriendButton.addActionListener(l -> {
            new MakeFriend();
            setVisible(false);
        });

        return makeFriendButton;
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