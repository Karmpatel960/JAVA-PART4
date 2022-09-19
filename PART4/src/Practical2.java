/*WAP to generate user defined exception using “throw” and “throws” keyword.*/

public class Practical2 {
    static void get(){
        try {
            throw new NullPointerException("Throw Try");
        }
        catch (NullPointerException e){
            System.out.println("Throw catch");
            throw e;
        }
    }

    static class MyExp extends Exception{
        public MyExp(String s) {
            super(s);
        }
    }
    public static void main(String[] args) throws java.lang.Exception{
        try {
            get();
        }
        catch (NullPointerException e) {
            System.out.println("Main Catch");
        }

        try{
            throw new MyExp("/ by Zero not allowed");
        }
        catch(MyExp e){
            System.out.println(e);
        }
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
