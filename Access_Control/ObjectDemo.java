package Access_Control;


//LEARNING ABOUT BUILT-IN OBJECT CLASS

public class ObjectDemo {
    int num;
    String name;

    public ObjectDemo(int num,float gpa){
        this.num=num;
        this.gpa=gpa;
    }

    @Override
    public int hashCode(){
      //  return super.hashCode(); //RETURNS RANDOM UNIQUE NUMBER
        return num; //RETRUNS THE VALUE ITSELF
    }

    @Override
    public boolean equals(Object obj){
 //       return super.equals(obj);
        return this.num=((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throw CloneNotSupportedException{
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();;
    }

    @Override
    public String toString(){
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(34,56.8);
        System.out.println(obj.hashCode());

        ObjectDemo obj2=new ObjectDemo(4,78.9);
        System.out.println(obj2.hashCode());


        //HASHCODE IS UNIQUE REPRESENTATION OF A VALUE BY A NUMBER

        if(obj2.equals(obj)){
            System.out.println("Obj2 is less than obj");
        }
        //JAVA GETS CONFUSED TO USE WHICH  VALUE IN THE

        System.out.println(obj instanceof Object);

        System.out.println(obj2.getClass());
        //GETCLASS STORED IN HEAP AREA
    }




}
