package ru.osipov.graphics.image;

public class myTextColorSchema implements TextColorSchema {
    @Override
    public char convert(int color) { //color = 0..255   256/8 = 32
        char[] c = new char[]{'#', '$', '@', '%', '*', '+', '-', '\''};
        return c[color/32];
    }
}