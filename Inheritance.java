
//ddj coaching
//Single Inheritance

public class Inheritance{
    void eat(){
        System.out.println("Animal is Eating.");
    }
    void run(){
        System.out.println("anu id running");
    }
    void roar(){
        System.out.println("animal is roaring");
    }
    void sleep(){
        System.out.println("lion is sleeping");
    }

}
class Lion extends Inheritance{
    void sleep(){
        System.out.println("lion is sleeping");             //priority beshi tai eta run korbe.
    }

}
class Main{
    public static void main(String[] args) {
        Lion Simba = new Lion();
        Simba.eat();
        Simba.run();
        Simba.roar();
        Simba.sleep();
    }
}