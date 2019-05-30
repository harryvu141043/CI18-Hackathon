package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background {
    Vector2D position;
    BufferedImage backgroundimage;
    public Background(){
        position=new Vector2D ( 0,0 );
        backgroundimage= SpriteUtils.loadImage ( "assets/images/Background/0.png" );
    }
   public void render(Graphics g){
        g.drawImage ( backgroundimage,(int)position.x,(int)position.y,null );
   }
   public void run(){
        position.y--;
   }
}
