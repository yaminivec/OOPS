package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(30);
        son.career();
        Daughter daughter=new Daughter(28);
        daughter.career();

        //CANT CREATE OBJECTS OF ABSTRACT CLASS
        //Parent mom =new Parent();

        Parent.hello();

        }
}
