package com.barnyard;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.math.Rectangle;

public class Obstacle extends Actor {
    private Texture image;
    private Rectangle rectangle;
    public int posX;
    public int posY;
    private int width;
    private int height;

    Obstacle(int x) {
        this.image = new Texture("fence.png");
        this.posX = x;
        this.posY = 200;
        this.width = 25;
        this.height = 50;
        this.rectangle = new Rectangle(posX, posY, width, height);
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public boolean overlaps(Rectangle rect) {
        return rectangle.overlaps(rect);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(this.image, posX, posY, width, height);
    }

    @Override
    public void act(float delta) {
        super.act(delta);

        posX -= 8;

        if (this.posX < -200) {
            this.posX = 800;
        }
        this.rectangle.setPosition(posX, posY);
    }
}
