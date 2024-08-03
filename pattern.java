public class pattern {
    public static void hollow_rec(int row, int col) {
        // outer loop
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // cell -(i,j)
                if (i == 1 || i == row || j == 1 || j == col) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void rev_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

    // Inverted Half Pyramid Pattern With No.
    public static void inv_half_pyra(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Floyd's Triangle

    public static void Floyd_tri(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0 1 Triangle
    public static void zero_one_tri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }

            }
            System.out.println();

        }
    }

    // Butterfly patttern
    public static void Butterfly_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space 2(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space 2(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // Rhombus Pattern

    public static void Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space - n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    // hollow Rhombus

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces n - i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }

            // hollow modified rec code
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n || j == 1 || j == n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    // diamond pattern

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    // numbber pyramid
    public static void Num_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(

            );
        }
    }

    // palindromic pattern

    public static void palindromic_num(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // number1 descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // hollow_rec(4, 5);
        // rev_half_pyramid(7);
        // inv_half_pyra(5);
        // Floyd_tri(5);
        // zero_one_tri(5);
        // Butterfly_pattern(6);
        // Rhombus(5);
        // hollow_rhombus(6);
        // diamond(3);
        // Num_Pyramid(5);
        // palindromic_num(5);

    }
}
