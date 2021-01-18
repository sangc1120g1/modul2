package Thinterface;

 class animal1 {
     public static void main(String[] args) {
         animal[] Animals = new animal[2];
         Animals[0] = new tiger();
         Animals[1] = new chicken();
         for (animal Animal:Animals
              ) {
             Animal.makeSound();
             if(Animal instanceof chicken){
                 Edible edible = (chicken) Animal;
                 System.out.println(edible.howtoeat());
             }
         }
     }
}
public abstract class animal{
    public abstract String makeSound();
}
interface Edible{
   public String howtoeat();
}
class tiger extends animal{
    @Override
    public String makeSound() {
        return "gruuu";
    }
}
class chicken extends animal implements Edible{
    @Override
    public String howtoeat(){
        return "could be fried";
    }
    @Override
    public String makeSound(){
        return "o o o";
    }
}
class fruit implements Edible{
     @Override
    public String howtoeat(){
         return "fruit";
     }
}
class orange extends fruit{
     @Override
    public String howtoeat(){
         return "orange";
     }
}
class Apple extends fruit{
     @Override
    public String howtoeat(){
         return "Apple";
     }
}
