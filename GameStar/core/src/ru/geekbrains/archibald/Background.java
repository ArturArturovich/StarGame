package ru.geekbrains.archibald;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Background {

    Texture spaceTexture;

    public Background(){
        spaceTexture = new Texture("bg.png");
    }

    public void render(SpriteBatch batch){
        batch.draw(spaceTexture, 0,0);
    }

    public void update(){

    }

}
