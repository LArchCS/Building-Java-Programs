public class DrawV2 {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= 5-line; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (line-1)*2 + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
