package packages.Singleton;

//ONLY ONE OBJECT IS ALLOWED

public class Singleton {
    private int num=0;

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){

        //CHECK WHETHER 1 OBJECT ONLY IS CREATED OR NOT
        if(instance==null){
            instance=new Singleton();
        }
        return instance;


    }}
