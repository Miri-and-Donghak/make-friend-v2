package com.miri_and_donghak.makefriend.component.makeFriend.components;

import com.miri_and_donghak.makefriend.util.ImageUtil;
import javax.swing.*;
import java.awt.*;

public class ShowCharacter extends JPanel {
    private JLabel imgLabel;
    private String imageName;
    private Image dongHakBody;

    public ShowCharacter() {
    }

    public ShowCharacter(String imageName) {
        this.imageName = imageName;

        setLayout(new OverlayLayout(this)); // OverlayLayout으로 설정

        dongHakBody = ImageUtil.loadImage(this, "makeCharacter/" + imageName);
        ImageIcon icon = new ImageIcon(dongHakBody.getScaledInstance(840, 840, Image.SCALE_DEFAULT));

        imgLabel = new JLabel(icon);
        imgLabel.setOpaque(false);
        imgLabel.setBorder(BorderFactory.createEmptyBorder(0, 250, 0, 0));
        add(imgLabel);
        setOpaque(false);
    }
}