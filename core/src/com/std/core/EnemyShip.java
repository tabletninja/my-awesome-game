package com.std.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class EnemyShip {
	
	private float posX, posY;
	private Texture shipTexture;
	private Rectangle shipRectangle;
    public EnemyShip() {
    	this.posX = 400;
    	this.posY = 0;
    	this.shipTexture = new Texture(Gdx.files.internal("data/images/spaceshipGood.png"));
    	this.shipRectangle = new Rectangle(posX, posY, 32,32);
    }
	public void render(SpriteBatch spriteBatch) {
		spriteBatch.draw(shipTexture, posX, posY);
		
	}
	public void update(float delta) {
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			posX -= 50*delta;
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			posX += 50*delta;
		}
		
		shipRectangle.setPosition(posX, posY);
	}

}
