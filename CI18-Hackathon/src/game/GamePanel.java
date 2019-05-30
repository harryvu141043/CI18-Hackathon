package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends Panel {

    Background background;
    Player player;

    public GamePanel() {
        background=new Background ();
        player=new Player ();

    }

    @Override
    public void paint(Graphics g) {
        super.paint ( g );
        background.render ( g );
        player.render ( g );

    }
    public void gameloop(){
        long lastTime=0;
        while (true){
            long currentTime=System.currentTimeMillis ();
            if(currentTime-lastTime>1000/60){
                System.out.println (currentTime-lastTime);
                this.runall ();
                this.repaint ();
                lastTime=currentTime;

            }
        }
    }
    public void runall(){
        this.player.run ();
        this.background.run ();
    }

}
