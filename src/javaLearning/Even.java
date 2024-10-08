package javaLearning;

public class Even {

    public static void main(String[] args) {
        int i = 2;
        while (i <= 100) {
            // Print the number
            System.out.print(i);
            
            // Check if i is less than 100 to decide whether to add a comma
            if (i < 100) {
                System.out.print(", ");
            }
            
            // Increment i by 2 to get the next even number
            i += 2;
        }
    }
}
