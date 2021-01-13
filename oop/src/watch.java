public class watch {
    public static void main(String[] args) {
        StopWatch Watch = new StopWatch();
        double [] arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*100000;
        }
        Watch.start();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Watch.stop();
        System.out.println("time = "+Watch.getElapsedTime());
    }
}
class StopWatch{
    private double starTime,EndTime;
    public StopWatch(){}
    public double getStarTime(){
        return this.starTime;
    }
    public void setStarTime(double a){
        this.starTime = a;
    }
    public double getEndTime(){
        return this.EndTime;
    }
    public void setEndTime(double a){
        this.EndTime = a;
    }
    public void start(){
        this.starTime = System.currentTimeMillis();
    }
    public void stop(){
        this.EndTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return (this.EndTime-this.starTime);
    }
}