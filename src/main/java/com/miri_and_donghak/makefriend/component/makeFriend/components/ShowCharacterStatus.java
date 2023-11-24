package com.miri_and_donghak.makefriend.component.makeFriend.components;

import com.miri_and_donghak.makefriend.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

@Controller
public class ShowCharacterStatus extends JPanel {
    private Image backgroundImage;
    public static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    String[] gender = {"남자", "여자"};
    public ShowCharacterStatus(){
        backgroundImage = ImageUtil.loadImage(this, "makeFriendImage");

        add(new ShowCharacter("character"));
        add(new ShowCharacter("hairstyle_long"));

        setLayout(new OverlayLayout(this));
        setBackground(Color.decode("#F7DBDB"));
        setBorder(new LineBorder(Color.decode("#F8DEDE"), 2, true));
        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, -200, 0, this);
        }
    }
}
