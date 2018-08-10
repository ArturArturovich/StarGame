package ru.geekbrains.archibald;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Background background;



	
    @Override
	public void create () {
		batch = new SpriteBatch();
		background = new Background();

	}

    @Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
        background.render(batch);
		batch.end();
	}

	public void update(){
    	background.update();
	}



    @Override
	public void dispose () {
		batch.dispose();

	}
}
