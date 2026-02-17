package lab1;
import lab1.MyLibrary;
public class myAPP {
    public static void main(String[] args) {

    int num1=2;
    int exp = 4;

        System.out.println("hi");
    System.out.println("Factorial of "+num1+":"+ MyLibrary.factorial(num1) );
    System.out.println(" "+num1+" power of "+ exp +" will be "+ MyLibrary.Power(num1,exp) );
        System.out.println("Done !!!!");
    }
}
