package com.barnyard;

import com.badlogic.gdx.Gdx;

public class ViewportConstants {

    static public int hht(float x) {
        float px = Gdx.graphics.getHeight();
        return (int) (px * x);
    }

    static public int wht(float x) {
        float px = Gdx.graphics.getWidth();
        return (int) ( px * x);
    }
}
