package Point;

import java.util.Arrays;

public class Checkpoint {
    public static void main(String[] args) {

        Point2D myPoint2D = new Point2D(1,1);
        Point3D myPoint3D = new Point3D();
        String a = myPoint2D.toString();
        String b = myPoint3D.toString();
        System.out.println(a);
        System.out.println(b);
    }
}
class Point2D{
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] XY = {x,y};
    public Point2D(){}
    public Point2D(float x , float y ){
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
    public float[] getXY(){
        return XY;
    }
    public void setXY(float[] arr){
        this.XY = arr;
    }
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", XY=" + Arrays.toString(XY) +
                '}';
    }
}
class Point3D extends Point2D{
    private float z=0.0f;
    private float[] XYZ = {getX(),getY(),z};
    public Point3D(){}
    public Point3D(float x, float y ,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return XYZ;
    }

    public void setXYZ(float[] XYZ) {
        this.XYZ = XYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString()+
                "z=" + z +
                ", XYZ=" + Arrays.toString(XYZ) +
                '}';
    }
}