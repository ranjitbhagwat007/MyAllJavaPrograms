package Assignments;
import java.util.Scanner;
public class Assign11 {
	public static int add(int a, int b) {
        return a + b; }
    public static int subtract(int a, int b) {
        return a - b; }
    public static int multiply(int a, int b) {
        return a * b; }
    public static int divide(int a, int b) {
        return a / b; }
    public static int mod(int a, int b) {
        return a % b; }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
        System.out.println("Modulus: " + mod(a, b));
        scanner.close(); }}
