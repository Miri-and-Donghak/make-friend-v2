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
        BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");
        getContentPane().setCursor(blankCursor);


        JPanel lobby = new JPanel(new BorderLayout());

        JLabel point = new JLabel("ㅎㅇ");
        point.setFont(FontUtil.getFonts());

        lobby.addMouseMotionListener(new MouseAdapter() {
            int count = 0;
            @Override
            public void mouseMoved(MouseEvent e) {
                point.setLocation(e.getX(), e.getY() - 380);
            }
        });

        JPanel buttons = new JPanel();

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

        buttons.add(makeFriendButton);
        buttons.add(showMyFriend);

        lobby.add(point);
        lobby.add(buttons, BorderLayout.SOUTH);

        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);

        add(lobby);
    }
}