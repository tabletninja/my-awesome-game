package com.std.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class GameScreen implements Screen {

	Core core;
	
	private OrthographicCamera orthoCam;
	private SpriteBatch spriteBatch;
	private StretchViewport stretchPort;
	private Player player;
	
    public GameScreen(Core core) {
    	this.core = core;
    }
	@Override
	public void show() {
		spriteBatch = new SpriteBatch();
		orthoCam = new OrthographicCamera();
		orthoCam.position.set(800/2, 600/2, 0);
		stretchPort = new StretchViewport(800, 600, orthoCam);
		stretchPort.apply();
		
		player = new Player();
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		orthoCam.update();
		
		spriteBatch.setProjectionMatrix(orthoCam.combined);
		
		spriteBatch.begin();
		player.render(spriteBatch);
		spriteBatch.end();
		
		player.update(delta);
	}

	@Override
	public void resize(int width, int height) {
		stretchPort.update(width, height);

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
