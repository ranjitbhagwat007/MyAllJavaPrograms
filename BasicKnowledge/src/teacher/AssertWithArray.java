package teacher;

public class AssertWithArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40};
        

        // Using assert to check if the array length is 4
        assert numbers.length == 4 : "Array length should be 4";

        // Print array elements
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}