package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Main extends ApplicationAdapter {

    private ShapeRenderer shape;

    private float x = 100;
    private float y = 100;

    private float velocidade = 200;

    @Override
    public void create() {
        shape = new ShapeRenderer();
    }

    @Override
    public void render() {

        // Limpa a tela
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Movimento
        if (Gdx.input.isKeyPressed(Input.Keys.W))
            y += velocidade * Gdx.graphics.getDeltaTime();

        if (Gdx.input.isKeyPressed(Input.Keys.S))
            y -= velocidade * Gdx.graphics.getDeltaTime();

        if (Gdx.input.isKeyPressed(Input.Keys.A))
            x -= velocidade * Gdx.graphics.getDeltaTime();

        if (Gdx.input.isKeyPressed(Input.Keys.D))
            x += velocidade * Gdx.graphics.getDeltaTime();

        // Desenha o retângulo
        shape.begin(ShapeRenderer.ShapeType.Filled);

        shape.rect(x, y, 50, 50);

        shape.end();
    }

    @Override
    public void dispose() {
        shape.dispose();
    }
}