package com.barnyard;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuScreen implements Screen {

    private SpriteBatch batch;
    private Texture background;
    private Texture start;

    MenuScreen() {
        batch = new SpriteBatch();

        initialize();
    }

    public void initialize() {
        background = new Texture("background.png");
        start = new Texture("start.png");
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(background,0,0, background.getWidth(), Gdx.graphics.getHeight());
        batch.draw(start, Gdx.graphics.getWidth() / 2 - (start.getWidth() / 2), Gdx.graphics.getHeight() / 2);

        if (Gdx.input.justTouched()) {
            System.out.println("tapped");
            BarnyardBreakout.setScreenExternal(new GameplayScreen());
        }
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }
}
