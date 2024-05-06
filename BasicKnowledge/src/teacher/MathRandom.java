package teacher;

public class MathRandom {
    public static void main(String[] args) {
        double[] radiusArray = new double[10];
        for (int i = 0; i < 10; i++) {
            radiusArray[i] = 1 + Math.random() * 9;
        }

        for (int i = 0; i < 10; i++) {
            double radius = radiusArray[i];
            double area = Math.PI * radius * radius;
            System.out.println("Circle " + (i + 1) + " - Radius: " + radius + ", Area: " + area);
        }
    }
}

