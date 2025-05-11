package hackerrank_solution;

import java.util.Scanner;

class Solution3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//      String s = scan.next(); incorrect place to read string
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
