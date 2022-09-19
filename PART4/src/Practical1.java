
public class Practical1 {
    public static void main(String[] args){
        try {
            System.out.println(50 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("/ by Zero not allowed");
        }
        try {
            int arr[] = {1, 4, 5, 8};
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException r) {
            System.out.println("Index 10 out of bounds for length 4");
        }
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
