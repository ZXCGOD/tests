package game;

import game.core.GameObject;
import game.images.ImageCollection;

import java.awt.image.BufferedImage;

public class Player extends GameObject implements AbleToMove {
    private int animNumber = 0;
    private int direction = 0;
    private String name = "";
    private int moveCount = 0;
    private int AbleToMoveB = 0;
    private int AbleToMoveT = 0;
    private int AbleToMoveL = 0;
    private int AbleToMoveR = 0;
    private int ChanB = 0;
    private int ChanT = 0;
    private int ChanL = 0;
    private int ChanR = 0;

    public Player(int posX, int posY, int width, int height, String name) {
        super(posX, posY, height, width);
        this.name = name;
    }
    public void setChanB(int a)
    {
	this.ChanB = a;
    }
        public void setChanT(int a)
    {
	this.ChanT = a;
    }
        public void setChanR(int a)
    {
	this.ChanR = a;
    }
        public void setChanL(int a)
    {
	this.ChanL = a;
    }






    public void changeChanB(int a)
    {
	this.ChanB += a;
    }
        public void changeChanT(int a)
    {
	this.ChanT += a;
    }
        public void changeChanR(int a)
    {
	this.ChanR += a;
    }
        public void changeChanL(int a)
    {
	this.ChanL += a;
    }





    
    public int getChanB()
    {
	return this.ChanB;
    }
        public int getChanT()
    {
	return this.ChanT;
    }
        public int getChanR()
    {
	return this.ChanR;
    }
        public int getChanL()
    {
	return this.ChanL;
    }

   
    public void setAnimNumber(int a) {
        this.animNumber = a;
    }

    public void setATMb(int a) {
        this.AbleToMoveB = a;
    }
    public void setATMt(int a) {
        this.AbleToMoveT = a;
    }
    public void setATMr(int a) {
        this.AbleToMoveR = a;
    }
    public void setATMl(int a) {
        this.AbleToMoveL = a;
    }

    public BufferedImage getImage_() {
        return ImageCollection.man[direction][animNumber];
    }

    public void move(int deltax, int deltay)
    {
        super.move(deltax, deltay);
	/*   if (Math.abs(deltax) > Math.abs(deltay)) {
            if (deltax >= 0) {
                direction = 3;
            } else {
                direction = 2;
            }
        } else {
            if (deltay >= 0) {
                direction = 0;
            } else {
                direction = 1;
            }
        }

	moveCount++;
	if (moveCount == 4)
	    {
		moveCount =0;
		animNumber++;
		}
            if (animNumber == 4) {
            animNumber = 0;
	    }
	*/  }


    

    public void move(int deltax, int deltay, boolean isJump) {
        setPosx(deltax);
        setPosy(deltay);
        // Какой-то код с реализацией прыжка
    }

    public void showInfo() {
        System.out.println("My name is " + name);
    }
public int getATMb()
{
    return this.AbleToMoveB;
}

    public int getATMt()
{
    return this.AbleToMoveT;
}
    public int getATMr()
{
    return this.AbleToMoveR;
}
    public int getATMl()
{
    return this.AbleToMoveL;
}
}
