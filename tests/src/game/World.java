package game;

import game.core.GameObject;
import game.images.ImageCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class World extends JPanel {
    private ArrayList<GameObject> gameObjects;
    private ArrayList<GameObject> gameObjectsNR;
    public World(ArrayList<GameObject> gameObjects, ArrayList<GameObject> gameObjectsNR) {
        this.gameObjects = gameObjects;
	this.gameObjectsNR = gameObjectsNR;
    }

  
    private void drawBack(Graphics g)
    {
	super.paintComponent(g);
	BufferedImage img = ImageCollection.backGround;
        for (int i = 0; i<600; i=i+32)
	    {
		for (int j = 0; j<600; j = j + 32)
		g.drawImage(img, i, j, 32, 32, null);
	    }
    }

    protected void paintComponent(Graphics g)
    {

	super.paintComponent(g);
        drawBack(g);
	for (GameObject obj : gameObjects)
	    {
            BufferedImage img = obj.getImage_();
            g.drawImage(img, obj.getPosx(), obj.getPosy(), obj.getWidth(), obj.getHeight(), null);
	    }

	for (GameObject objN : gameObjectsNR)
	    {
            BufferedImage img = objN.getImage_();
            g.drawImage(img, objN.getPosx(), objN.getPosy(),objN.getWidth(), objN.getHeight(), null);
	    }

    }
}
     

