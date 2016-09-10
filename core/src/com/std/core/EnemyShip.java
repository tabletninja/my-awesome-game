package com.std.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class EnemyShip {
	
	private float posX, posY;
	private int hitpoints = 100;
	private Texture shipTexture;
	private Rectangle shipRectangle;
    public EnemyShip(Texture shipTexture, float posX, float posY) {
    	this.posX = posX;
    	this.posY = posY;
    	this.shipTexture = shipTexture;
    	this.shipRectangle = new Rectangle(posX, posY, 32,32);
    }
	public void render(SpriteBatch spriteBatch) {
		spriteBatch.draw(shipTexture, posX, posY);
		
	}
	public void update(float delta) {		
		shipRectangle.setPosition(posX, posY);
		posY -= 4;
	}

}
