public class IT25103816tutorialQ4 {
    public static void main(String[] args) {
        
        
        System.out.println("Using while loop:");
        System.out.println();
        
        int row = 1;
        while (row <= 5) {
            int col = 1;
            while (col <= 5) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        
        System.out.println();
        
        // Using for loop for triangle
        for (int i = 1; i <= 5; i++) {
            for (int space = 1; space <= 5 - i; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}