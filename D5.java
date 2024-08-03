public class D5 {
    public static void star_pattern(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star < line; star++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void inverted_star_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void half_pyramid(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(star);

            }
            System.out.println();
        }
    }

    public static void ABC_pattern(int n) {
        char ch = 'A';
        // outer loop
        for (int line = 1; line <= n; line++) {
            // inner loop
            for (int chars = 1; chars <= line; chars++) {

                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // star pattern
        star_pattern(5);

        // inverted star pattern
        inverted_star_pattern(5);

        // }

        // print half pyramid
        half_pyramid(5);

        // ABC pattern
        ABC_pattern(5);

    }
}
