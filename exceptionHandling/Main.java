package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
     //       divide(a ,b);
            String name="Kunal";
            if(name.equals("Kunal")){
                throw new MyException("name is kunal");
            }
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
           System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("NORMAL EXCEPTION");
        }
        finally{
            System.out.println("THIS WILL ALWAYS EXECUTE");
        }

    }
    static int divide(int a,int b)throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("DON'T DIVIDE BY 0");
        }
        return a/b;
    }
}