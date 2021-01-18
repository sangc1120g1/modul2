package Mypoint;

import java.util.Arrays;

public class Checkpoint {
    public static void main(String[] args) {
        Point myPoint = new Point(1,1);
        MoveablePoint myPoint1 = new MoveablePoint(1,1);
        String a = myPoint.toString();
        String b = myPoint1.toString();
        System.out.println(a);
        System.out.println(b);
    }
}

class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] xy = {x, y};

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXy() {
        return xy;
    }

    public void setXy(float[] xy) {
        this.xy = xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(xy) +
                '}';
    }
}

class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float[] XYSpeed = {xSpeed, ySpeed};

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getXYSpeed() {
        return XYSpeed;
    }

    public void setXYSpeed(float[] XYSpeed) {
        this.XYSpeed = XYSpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                super.toString()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", XYSpeed=" + Arrays.toString(XYSpeed) +
                '}';
    }
    public MoveablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}