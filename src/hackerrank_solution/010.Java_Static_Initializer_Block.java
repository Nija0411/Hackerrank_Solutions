package hackerrank_solution;

import java.util.Scanner;

class Java_Static_Initializer_Block {
    static int b;
    static int h;

    static {
        Scanner input = new Scanner(System.in);
        b = input.nextInt();
        h = input.nextInt();
        if (b > 0 && h > 0) {
            System.out.println(b * h);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

    }
}
