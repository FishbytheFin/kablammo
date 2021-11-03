package com.fishbythefin.main;

import java.awt.*;

public class Player extends GameObject{

    public Player(int x, int y, ID id) {
        super(x, y, id);

        velX = 0;
        velY = 0;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if (velX > 0) {
            velX--;
        } else if (velX < 0) {
            velX++;
        }

        if (velY > 0) {
            velY--;
        } else if (velY < 0) {
            velY++;
        }


    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 69, 69);
    }
}
