package com.std.core;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Bullet {
	
	private float posX, posY;
	private float velocityX, velocityY;
	private Texture texture;
	private Rectangle rectangle;

    public Bullet(Texture texture, float posX, float posY,
    		float velocityX, float velocityY) {
    	this.posX = posX;
    	this.posY = posY;
    	this.velocityX = velocityX;
    	this.velocityY = velocityY;
    	this.texture = texture;
    	this.rectangle = new Rectangle(posX, posY, 32,32);
    }
	public void render(SpriteBatch spriteBatch) {
		spriteBatch.draw(texture, posX, posY);
		
	}
	public void update(float delta) {		
		posX = posY + velocityX * delta;
		posY = posY + velocityY * delta;
		rectangle.setPosition(posX, posY);
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
}
