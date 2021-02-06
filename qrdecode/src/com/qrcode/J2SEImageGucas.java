package com.qrcode;

import jp.sourceforge.qrcode.data.QRCodeImage;

import java.awt.image.BufferedImage;

/**
 * @Author : lyb
 * @Date : 2020/10/15 3:52 下午
 * @Description : qq
 */
public class J2SEImageGucas implements QRCodeImage {

    BufferedImage image;

    public J2SEImageGucas(BufferedImage image) {
        this.image = image;
    }

    public int getWidth() {
        return image.getWidth();
    }

    public int getHeight() {
        return image.getHeight();
    }

    public int getPixel(int x, int y) {
        return image.getRGB(x, y);
    }
}
