package abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("I am going to be a Engineer");
    }

    @Override
    void partner(){
        System.out.println("I love Rohan he is 20");
    }
}
