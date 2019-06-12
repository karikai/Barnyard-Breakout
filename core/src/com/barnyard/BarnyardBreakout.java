package com.barnyard;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

public class BarnyardBreakout extends Game {

	private static Game game;
	public static Label.LabelStyle labelStyle;

	BarnyardBreakout() {
		game = this;
	}

	@Override
	public void create () {
		labelStyle = new Label.LabelStyle();
		labelStyle.font = new BitmapFont(Gdx.files.internal("font.fnt"));

		setScreen(new MenuScreen());
	}

	public static void setScreenExternal(Screen s) {
		game.setScreen(s);
	}

}
