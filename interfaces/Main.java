package interfaces;

public class Main {
    public static void main(String[] args) {
       Engine car=new Car();
        car.acc();
        car.start();
        car.stop();

        //WE CANNOT USE VALUES FROM OTHER IMPLEMENTED CLASSES BECAUSE THE VALUES STAY AS FINAL
        //a IS A VALUE PRESENT IN IMPLEMENTED CLASS
     //  car.a;

      //  Media carmedia=new Car();
       // carmedia.stop();

        NiceCar car1=new NiceCar();
        car1.start();
        car1.startMusic();
        car1.upgradeEngine();
        car1.start();

    }
}
