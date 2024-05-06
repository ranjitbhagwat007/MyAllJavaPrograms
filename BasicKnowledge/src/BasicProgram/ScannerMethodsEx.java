package BasicProgram;
import java.util.Scanner;
public class ScannerMethodsEx{  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        utilizeScannerMethods(scanner);
        scanner.close();}  
     static void utilizeScannerMethods(Scanner scanner) {          
    	System.out.print("Enter an int: ");
        int numInt = scanner.nextInt();
        System.out.println("You entered: " + numInt);
        System.out.print("Enter a byte: ");
        int numByt = scanner.nextByte();
        System.out.println("You entered: " + numByt);
        System.out.print("Enter a short: ");
        int numShort = scanner.nextShort();
        System.out.println("You entered: " + numShort);
        System.out.print("Enter a long: ");
        long numLong = scanner.nextLong();
        System.out.println("You entered: " + numLong);
        System.out.print("Enter a boolean (true/false): ");
        boolean bool = scanner.nextBoolean();
        System.out.println("You entered: " + bool);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.println("You entered: " + str);
        System.out.print("Enter a float: ");
        float flt = scanner.nextFloat();
        System.out.println("You entered: " + flt);
        System.out.print("Enter a double: ");
        double numDouble = scanner.nextDouble();
        System.out.println("You entered: " + numDouble);  }}

