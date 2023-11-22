package com.miri_and_donghak.makefriend.util;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageUtil {
    public static Image loadImage(Object currentSource, String imageName) {

        URL image = currentSource.getClass().getResource("/images/" + imageName + ".png");
        assert image != null;
        return new ImageIcon(image).getImage();
    }
}
