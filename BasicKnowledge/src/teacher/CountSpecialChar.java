package teacher;
public class CountSpecialChar {
    public static void main(String[] args) {
        String name = "Manish!@#";
        int specialCharCount = 0;
        
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            
            if (!Character.isLetterOrDigit(c)) {
                specialCharCount++;
            }
        }
        System.out.println("Number of special characters: " + specialCharCount);
    }
}
