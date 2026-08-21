package packages.staticExamples;

public class Main {
    public static void main(String[] args) {

        System.out.println(Human.population); // 0 POPULATION CAN BE USED WITHOUT CREATING OBJECTS CAN BE USED WITHOUT

        Human kunal=new Human(32,"Kunal",10000,false);
        System.out.println(kunal.population); //OUTPUT IS 1 BECAUSE PREVIOUSLY ONLY ONE OBJECT IS CREATED

        Human rahul=new Human(22,"Rahul",15000,true);
        System.out.println(kunal.population); // 2 RETURNS POPULATION VALUE FOR EVERY OBJECT CREATED
        System.out.println(rahul.population); // 2

    }
}
