package com.barnyard;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;


public class Runner extends Actor {
    private Texture image;
    private Rectangle rectangle;
    public int posX;
    public int posY;
    public int velocityY;
    private int width;
    private int height;
    private boolean inAir;

    Runner(Texture texture, int x, int y) {
        this.image = texture;
        this.posX = x;
        this.posY = y;
        this.width = 50;
        this.height = 100;
        this.inAir = false;
        this.rectangle = new Rectangle(x,y,width,height);
    }

    public void jump() {
        this.velocityY += 50;
        this.inAir = true;
    }

    public boolean overlaps(Rectangle rect) {
        return this.rectangle.overlaps(rect);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(this.image, posX, posY, width, height);
    }

    @Override
    public void act(float delta) {
        super.act(delta);

        this.velocityY -= 4;

        this.posY += velocityY;

        if (posY <= 200){
            this.inAir = false;
            this.velocityY = 0;
            this.posY = 200;
        }

        if (Gdx.input.justTouched() && !this.inAir) {
            this.jump();
        }

        this.rectangle.setPosition(posX, posY);
    }
}
