
public class Lines {

    public static void main(String[] args) {
        int width = 4;
        int height = 3;
        for (int i = 0; i < width; i++) {

            System.out.print("=");

        }
        System.out.println("");
        for (int i = 0; i < height; i++) {
            System.out.print("||");
            for (int j = 0; j < width; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
    }
}
