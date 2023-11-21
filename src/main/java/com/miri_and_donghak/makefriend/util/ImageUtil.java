package com.miri_and_donghak.makefriend.util;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageUtil {
    public static Image loadImage(Object currentSource, String imageName) {
        Image finalImage = null;

        URL image = currentSource.getClass().getResource("/images/" + imageName + ".png");
        // /imgaes/background.png
        if (image != null) finalImage = new ImageIcon(image).getImage();

        return finalImage;
    }
}
