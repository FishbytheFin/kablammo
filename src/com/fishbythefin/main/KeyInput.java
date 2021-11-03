package com.fishbythefin.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;
    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.objects.size(); i++) {
            GameObject tempObject = handler.objects.get(i);

            if (tempObject.getId() == ID.Player) {
                //Key events for PLayer 1

                if (key == KeyEvent.VK_W) {
                    tempObject.setVelY(-10);
                } else if (key == KeyEvent.VK_S) {
                    tempObject.setVelY(10);
                } else if (key == KeyEvent.VK_A) {
                    tempObject.setVelX(-10);
                } else if (key == KeyEvent.VK_D) {
                    tempObject.setVelX(10);
                }
            }
        }
    }


    public void keyReleased(KeyEvent e) {

    }
}
