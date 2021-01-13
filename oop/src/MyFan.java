public class MyFan {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan Fan2 = new Fan();
        Fan1.setSpeed(Fan1.FAST);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setOn(true);
        Fan2.setSpeed(Fan2.MEDIUM);
        System.out.println("Fan 1: "+Fan1.Infor());
        System.out.println("Fan 2: "+Fan2.Infor());
    }
}
class Fan{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    public Fan(){}
    private int speed = this.SLOW;
    private boolean On = false;
    private double Radius = 5;
    private String color = "blue";
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int a){
        this.speed = a;
    }
    public boolean getON(){
        return this.On;
    }
    public void setOn(boolean a){
        this.On = a;
    }
    public double getRadius(){
        return this.Radius;
    }
    public void setRadius(double a){
        this.Radius = a;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String a){
        this.color = a;
    }
    public String Infor(){
        if (this.On){
            return "màu là: "+this.color+", tốc độ là: "+this.speed+", bán kính cánh là: "+this.Radius+", Fan is on";
        }
        else {
            return "màu là: "+this.color+", tốc độ là: "+this.speed+", bán kính cánh là: "+this.Radius+", Fan is off";
        }
    }
}
