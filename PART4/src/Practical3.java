/*Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two
exceptions. Each ‘catch’ block handles a different type of exception. For example the
exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’.
Display a message in the ‘finally’ block.*/
public class Practical3 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
           // System.out.println(a[10]);
          a[5]=30/0;

        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Block Reached");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception Block Reached");
        }
        finally {
            System.out.println("Finally block Reached");
        }
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
