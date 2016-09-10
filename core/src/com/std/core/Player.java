package com.std.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Player {

	private float posX, posY;
	private Texture playerTexture;
	private Rectangle playerRectangle;
    public Player() {
    	this.posX = 400;
    	this.posY = 0;
    	this.playerTexture = new Texture(Gdx.files.internal("data/images/spaceshipGood.png"));
    	this.playerRectangle = new Rectangle(posX, posY, 32,32);
    }
	public void render(SpriteBatch spriteBatch) {
		spriteBatch.draw(playerTexture, posX, posY);
		
	}
	public void update(float delta) {
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			posX -= 50*delta;
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			posX += 50*delta;
		}
		
		playerRectangle.setPosition(posX, posY);
	}

}
