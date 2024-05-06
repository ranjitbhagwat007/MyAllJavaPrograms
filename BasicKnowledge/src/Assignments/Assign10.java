package Assignments;

public class Assign10 {
     final static double PI = 3.14159;

    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        double radius = 3; 
 
        double area = calculateArea(radius);
        System.out.println("Area of the circle: " + area);

        double circumference = calculateCircumference(radius);
        System.out.println("Circumference of the circle: " + circumference);
    }
}

