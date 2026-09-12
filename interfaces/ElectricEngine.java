package interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start(){
System.out.println("ELECTRIC ENGINE STARTS");
    }
    @Override
    public void stop(){

        System.out.println("ELECTRIC ENGINE STOPS ");

    }

    @Override
    public void acc() {
        System.out.println("ELECTRIC ENGINE ACCLERATES");
    }
}
