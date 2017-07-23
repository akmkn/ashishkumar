import java.util.Scanner;

public class EvenOdd{
    public static Scanner scan;
        
    public static void main(String args []){
        System.out.println("Please enter any two or three digit number");
        scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Please write a decimal numeber");
        float y = scan.nextFloat();
        System.out.println("*** Results of Inputs are ***");
        if (x%2==0){
            System.out.println("Integer number written is EVEN");
        }
        else{
            System.out.println("Integer number written is ODD");
        }
        if(y%2==0){
            System.out.println("Decimal number witten is EVEN");
        }
        else{
            System.out.println("Decimal number written is ODD");
        }
        
        }
    }