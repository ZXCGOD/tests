import game.Player;
import game.Tree;
import game.Stopper;
import game.World;
import game.core.GameObject;

import game.Player;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Game {
        
    public static ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
    public static ArrayList<GameObject> gameObjectsNR = new ArrayList<GameObject>();
    private static int cr = 0;
    private static int cl = 0;
    private static int ct = 0;
    private static int cb = 0;
    public static void main(String[] args) {
     
        Player player = new Player(
            300,
            500,
            50, // 67
            100,
            "Bob"
        );
      

        for (int i = 0; i < 6; i++) {
            Tree tree = new Tree(
				 //	 (int) (Math.random() * 500),
				 //				 (int) (Math.random() * 500),
				 i*60,
				 i*60,
				 60,
				 60,
				 i
				 );
            gameObjects.add(tree);
        }
	  gameObjectsNR.add(player);

        JFrame window = new JFrame("Game");
        World world = new World(gameObjects, gameObjectsNR);
	
        window.setContentPane(world);
        window.setSize(600, 600);
        window.setVisible(true);
        window.addKeyListener(
            new KeyListener() {
                public void keyPressed(KeyEvent e) {
		    int key = e.getKeyCode();
                    if (key == 65) // A
			{
			    int c = 0;
			      for (GameObject obj : gameObjects)
				  if (Stopper.leftCheck(player.getPosx(),player.getPosy(), obj.getPosx(), obj.getPosy(), obj.getWidth(), obj.getHeight(), player.getHeight(), player.getWidth())==1)
				c = 1;
				if (c == 0) player.move(-5, 0); 
			}
		    else if (key == 68) // D
			{
			   int c = 0;
			      for (GameObject obj : gameObjects)
				  if (Stopper.rightCheck(player.getPosx(),player.getPosy(), obj.getPosx(), obj.getPosy(), player.getWidth(), obj.getHeight(), player.getHeight(), obj.getWidth())==1)
				c = 1;
				if (c == 0)
				    player.move(5, 0);
		            

		    } else if (key == 87) { // W
			   int c = 0;
			      for (GameObject obj : gameObjects)
				  if (Stopper.topCheck(player.getPosx(),player.getPosy(), obj.getPosx(), obj.getPosy(), obj.getWidth(), player.getWidth(), player.getHeight())==1)
				      c = 1;
				if (c == 0)
				    player.move(0, -5);
			   }

		    else if (key == 83) // S
 			     {
			     int c = 0;
			     for (GameObject obj : gameObjects)
				 if (Stopper.botCheck(player.getPosx(),player.getPosy(), obj.getPosx(), obj.getPosy(), player.getWidth(), obj.getWidth(), player.getHeight())==1)
				     c = 1;
			     if (c == 0) 
			     player.move(0, 5);
				   }
                    window.repaint();
		    try {Thread.sleep(5);}
		    catch(Exception exc){}
		   
                }

                public void keyReleased(KeyEvent e) {
		     int key = e.getKeyCode();
                    if (key == 65) {
                        player.setAnimNumber(0);
                    } else if (key == 68) {
                        player.setAnimNumber(1);
                    } else if (key == 87) {
                        player.setAnimNumber(0);;
                    } else if (key == 83) {
                       player.setAnimNumber(0);
                    }
                    window.repaint();
                }

                public void keyTyped(KeyEvent e) {
                }
            }
        );
    }
}
