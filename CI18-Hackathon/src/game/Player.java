package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
    BufferedImage playerimage;
    Vector2D position;
    public Player(){
        playerimage= SpriteUtils.loadImage ( "assets/images/Player/player.png" );
        position=new Vector2D ( 400,200 );
    }
    public void render(Graphics g){
        g.drawImage ( playerimage,(int)position.x,(int)position.y,null );

    }
    public void run(){
        this.move();
        System.out.println (KeyEventPress.isLeftPress);
    }

    private void move() {
        if(KeyEventPress.isUpPress){
            position.y-=5;
        }
        if(KeyEventPress.isLeftPress){
            position.x-=5;
        }
        if(KeyEventPress.isDownPress){
            position.y+=5;
        }
        if(KeyEventPress.isRightPress){
            position.x+=5;
        }
    }
}
