package test;

import org.junit.Assert;
import org.junit.Test;
import game.Stopper;
import game.Tree;

import java.awt.geom.Point2D;

public class Tests {

    @Test
    public void collisionTopCheck() {
        int result = Stopper.botCheck(100, 100, 100, 130, 30, 30, 100);
        Assert.assertEquals(1, (int) result);
    }

    @Test
    public void collisionBottomCheck() {
        int result = Stopper.topCheck(100, 100, 100, 130, 30, 30, 100);
        Assert.assertEquals(0, (int) result);
    }

    @Test
    public void collisionRightCheck() {
        int result = Stopper.leftCheck(100, 100, 100, 130, 30, 30, 100, 100);
        Assert.assertEquals(1, (int) result);
    }

    @Test
    public void collisionLeftCheck() {
        int result = Stopper.rightCheck(100, 100, 100, 130, 30, 30, 100, 100);
        Assert.assertEquals(1, (int) result);
    }

    @Test
    public void checkTreeConstructor() {
        int result = Stopper.botCheck(100, 100, 100, 130, 30, 30, 100);
        Assert.assertEquals(1, (int) result);
    }

}