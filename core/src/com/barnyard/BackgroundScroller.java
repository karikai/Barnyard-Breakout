package com.barnyard;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class BackgroundScroller extends Actor {

    private Texture background1;
    private Texture background2;
    private int backgroundX;
    private int backgroundX2;

    public BackgroundScroller() {
        this.background1 = new Texture("background.png");
        this.background2 = new Texture("background.png");
        this.backgroundX = -(background1.getWidth());
        this.backgroundX2 = 0;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(background1,backgroundX,0, background1.getWidth(), Gdx.graphics.getHeight());
        batch.draw(background2,backgroundX2,0, background2.getWidth(), Gdx.graphics.getHeight());
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        backgroundX -= 2;
        backgroundX2 -= 2;

        if (backgroundX < -(background1.getWidth())) {
            backgroundX = backgroundX2 + background1.getWidth();
        }

        if (backgroundX2 < -(background1.getWidth())) {
            backgroundX2 = backgroundX + background1.getWidth();
        }
    }
}
