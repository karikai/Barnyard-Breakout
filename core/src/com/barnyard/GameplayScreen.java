package com.barnyard;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

public class GameplayScreen implements Screen {
    Stage barnWorld;
    Runner mainPlayer;
    Obstacle obstacle;
    BackgroundScroller background;
    Label scoreKeeper;
    float score;
    boolean gameOver;
    BitmapFont font;

    GameplayScreen() {
        initialize();
    }


    public void initialize() {
        barnWorld = new Stage();
        background = new BackgroundScroller();
        barnWorld.addActor(background);
        mainPlayer = new Runner(new Texture("bird.png"), Gdx.graphics.getWidth() / 2 - 12,200);
        barnWorld.addActor(mainPlayer);
        obstacle = new Obstacle(800);
        barnWorld.addActor(obstacle);
        scoreKeeper = new Label("55",BarnyardBreakout.labelStyle);
        scoreKeeper.setPosition(Gdx.graphics.getWidth() / 2 - (scoreKeeper.getWidth() / 2), Gdx.graphics.getHeight() - 200);
        scoreKeeper.setFontScale(3f);
        barnWorld.addActor(scoreKeeper);

        gameOver = false;
        score = 0;
        font = new BitmapFont(Gdx.files.internal("font.fnt"));
    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (!gameOver) {

            if (mainPlayer.overlaps(obstacle.getRectangle())) {
                gameOver = true;
            } else {
                score += .1;
            }

            scoreKeeper.setPosition(Gdx.graphics.getWidth() / 2 - (scoreKeeper.getWidth() / 2), Gdx.graphics.getHeight() - 200);
            scoreKeeper.setText(String.valueOf((int)score));
            barnWorld.act(1/60f);
            barnWorld.draw();
            System.out.println(score);
        } else {
            BarnyardBreakout.setScreenExternal(new MenuScreen());
        }
    }

    @Override
    public void dispose () {
        barnWorld.dispose();
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
